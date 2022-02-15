public static int[] solution(int h, int[] q) {
        int[] arr = new int[q.length];
        int size = (int)Math.pow(2, h) - 1;
        int end, mid, start;
        for(int i = 0; i<q.length; i++){
            end = size;
            start = 0;
            if(q[i] == size){
                arr[i] = -1;
            } else {
                while (true){
                    end = end - 1;

                    mid = start + (end - start) / 2;

                    if (mid == q[i] || end == q[i]) {
                      arr[i] = end + 1;
                      break;
                    } else if (q[i] < mid) {
                      end = mid;
                    } else {
                      start = mid;
                    }
                }
            }
        }

        return arr;

    }
