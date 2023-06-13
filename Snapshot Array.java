class SnapshotArray {
    List<TreeMap<Integer, Integer>> snaps;
    Map<Integer, Integer> buffer;
    int snapId = 0;
    public SnapshotArray(int length) {
        buffer = new HashMap<>();
        snaps = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            snaps.add(new TreeMap<>());
            snaps.get(i).put(snapId, 0);
        }
    }
    
    public void set(int index, int val) {
        buffer.put(index, val);
    }
    
    public int snap() {
        for (int index : buffer.keySet()) {
            snaps.get(index).put(snapId, buffer.get(index));
        }
        buffer = new HashMap<>();
        snapId++;
        return snapId - 1;
    }
    
    public int get(int index, int snap_id) {
        return snaps.get(index).floorEntry(snap_id).getValue();
    }
}
