class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int seat_sum = 0;
        int student_sum = 0;
        for(int i = 0 ;i<seats.length;i++){
            seat_sum= seat_sum+seats[i];
            student_sum= student_sum+students[i];
        }
        return Math.abs(seat_sum-student_sum);
    }
}