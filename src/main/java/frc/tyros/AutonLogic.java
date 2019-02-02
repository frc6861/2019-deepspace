/*AUTONOMOUS LOGIC
	
	0) use prox sensor to always detect if a robot is within a few feet
	0) manual override (at every individual command, we will use a button press to stop the program and start teleop)

	ROCKET AUTON

		START HATCH BALL LOADED [START AT SIDE OF PLATFORM] <HORIZONTAL VALUES ARE REVERSED FOR THE OTHER ROCKET> 
		(BOTTOM 2 HATCHES AND THEN 2 BALLS) **THIS LOOP WILL CONTINUE AFTER SANDSTORM TO WORK, YOU MUST USE HUMAN PLAYERS**
		1) drive straight off the side of the level 1 platform
		2) strafe diagonally to the ball deposit (middle) of the rocket
		3) use color sensors to follow white line
	-----------------
		4) prox sensor to stop right in front of rocket
		5) drop HATCH in a spot
		6) back up, following white line along line
		7) keep following until white line is no longer visible
		8) rotate 90 deg toward the alliance station
		9) drive forward and use prox sensor to stop before wall (have the robot remember how much distance this was)
		10) use human player to load HATCH
		11) rotate 180 deg
		12) drive the same distance and strafe slightly and align with hatch line (alternate sides)
		13) align and deploy HATCH
		14) back up, following white line along line
		15) keep following until white line is no longer visible
		16) rotate 90 deg toward the alliance station
		17) drive forward and use prox sensor to stop before wall (have the robot remember how much distance this was)
		18) use human player to load BALL
		19) rotate 180 deg
		20) drive the same distance and strafe slightly and align with hatch line (alternate sides)
		21) align and deploy BALL
		22) back up, following white line along line
		23) keep following until white line is no longer visible
		24) rotate 90 deg toward the alliance station
		25) drive forward and use prox sensor to stop before wall (have the robot remember how much distance this was)
		26) use human player to load BALL
		27) rotate 180 deg
		28) drive the same distance and strafe slightly and align with hatch line (alternate sides)
		29) align and deploy BALL
		30) back up, following white line along line
		31) keep following until white line is no longer visible
		32) rotate ~60 deg toward the alliance station
		33) drive forward and use prox sensor to stop before wall (have the robot remember how much distance this was)
		34) use human player to load HATCH
		35) rotate 180 deg
		36) drive the same distance and strafe slightly and align with ball line (middle)
		
CARGO AUTON

		START HATCH LOADED [START AT CENTER] <HORIZONTAL VALUES ARE REVERSED FOR THE OTHER SIDE OF THE CARGO SHIP>
		(MIDDLE 1 HATCH, SIDE 1 HATCH)
		1) drive straight off the middle of the level 1 platform
		2) strafe diagonally to the ball deposit (middle) of the rocket
		3) use color sensors to follow white line
		4) prox sensor to stop right in front of cargo
		5) drop HATCH in a spot
		6) back up, following white line along line
		7) keep following until white line is no longer visible
		8) rotate 180 degrees
		9) strafe over to roughly align with the human player
		10) drive up to human player
		11) white line to align precisely
		12) prox sensor to stop before wall
		13) pick up hatch
		14) rotate 180 deg
		15) drive back a longer distance
		16) rotate 90 degrees toward cargo ship
		17) use color sensors to follow white line
		18) use color sensors to follow white line
		19) drop HATCH in a spot
CARGO AUTON

		START HATCH LOADED [START AT CENTER] <HORIZONTAL VALUES ARE REVERSED FOR THE OTHER SIDE OF THE CARGO SHIP>
		(MIDDLE 1 HATCH, MIDDLE 2 HATCH)
		1) drive straight off the middle of the level 1 platform
		2) strafe diagonally to the ball deposit (middle) of the rocket
		3) use color sensors to follow white line
		4) prox sensor to stop right in front of cargo
		5) drop HATCH in a spot
		6) back up, following white line along line
		7) keep following until white line is no longer visible
		8) rotate 180 degrees
		9) strafe over to roughly align with the human player
		10) drive up to human player
		11) white line to align precisely
		12) prox sensor to stop before wall
		13) pick up hatch
		14) rotate 180 deg
		15) strafe wide diagonally to opposite middle spot
		16) use color sensors to follow white line
		17) prox sensor to stop right in front of cargo
		18) drop HATCH in a spot
CARGO AUTON

		START HATCH LOADED [START AT EDGE OF PLATFORM] <HORIZONTAL VALUES ARE REVERSED FOR THE OTHER SIDE OF THE CARGO SHIP>
		(SIDE 1 HATCH, SIDE 2/3 HATCH)
		1) be facing to the side at the start of the match || face forward and drive off
		2) back up then strafe to the side 1 spot || rotate 90 deg toward cargo spot side 1
		3) white line to align
		4) prox sensor to stop
		5) place HATCH
		6) back up
		7) rotate 90 deg toward human player
		8) drive back with light strafing
		9) white line to align
		10) prox to stop before wall
		11) pick up HATCH
		12) rotate 180 deg
		13) drive farther (could be even farther for side 3) to side of cargo (with a little strafing) to second spot
		14) rotate 90 deg toward cargo
		15) white line to align
		16) prox sensor to stop
		17) place HATCH
CARGO AUTON
		
		START WITH HATCH LOADED [START AT CENTER] (MIDDLE 1 HATCH)
		1) drive forward off platform
		2) color sensor to align
		3) prox sensor to stop
		4) place HATCH
		5) back up along white line then back up for about 2 more seconds (to be just in front of the HAB line)
CARGO/ROCKET AUTON

		START HATCH LOADED [START AT EDGE OF PLATFORM] <HORIZONTAL VALUES ARE REVERSED FOR THE OTHER SIDE OF THE CARGO SHIP>
		(SIDE 1 HATCH, ROCKET 1 HATCH)
		1) be facing to the side at the start of the match || face forward and drive off
		2) back up then strafe to the side 1 spot || rotate 90 deg toward cargo spot side 1
		3) white line to align
		4) prox sensor to stop
		5) place HATCH
		7) rotate 90 deg toward human player
		8) drive back with light strafing
		9) white line to align
		10) prox to stop before wall
		11) pick up HATCH
		12) rotate 180 deg
		13) drive less distance with light strafing to rocket
		14) rotate 90 deg toward rocket
		15) white line to align
		16) prox sensor to stop
		17) place HATCH
*/