class DynamicArray {
    private int[] nums;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        nums = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public int get(int i) {
        return nums[i];
    }

    public void set(int i, int n) {
        nums[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            resize();
        }
        nums[size] = n;
        size++;
    }

    public int popback() {
        int pop = nums[size-1];
        size--;
        return pop;
    }

    private void resize() {
        capacity = 2*capacity;
        int[] nums2 = new int[capacity];
        for(int i=0; i<nums.length; i++){
            nums2[i] = nums[i];
        }
        nums = nums2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
