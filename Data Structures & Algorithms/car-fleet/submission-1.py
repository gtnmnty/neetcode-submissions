class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        if not position:
            return 0

        # Combine and sort by position descending
        cars = sorted(zip(position, speed), reverse=True)

        fleets = 1
        prev_time = (target - cars[0][0]) / cars[0][1]

        for i, speed in cars[1:]:
            curr_time = (target - i) / speed
            if curr_time > prev_time:
                fleets += 1
                prev_time = curr_time

        return fleets