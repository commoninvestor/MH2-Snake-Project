setscreen ("graphics:640;480,nocursor")
% Declarations and Initializations

% the number of pixels the snake moves upon each iteration
var speed: int := 1
% the x and y pixel coordinates of the snakehead                                                       
var centreX: int                                               
var centreY: int
var radius: int := 7                                         
var direction : string (1) := "d"
var track : int := 0 
var edgeXL : int := 8
var edgeYD : int := 24
var edgeXR : int := maxx - 8
var edgeYU : int := maxy - 33                 

%draws a box with left border at pixel 8, right border at pixel 632, bottom border at pixel 24 and top border at pixel 447
Draw.Box (edgeXL, edgeYD, edgeXR, edgeYU, red)                  

%the coordiates of centre of ball are randomly generated - specified coordiates ensure the ball remains within the rectangular frame
centreX := Rand.Int (1 + edgeXL + radius, edgeXR - 1 - radius)             
centreY := Rand.Int (edgeYD + radius + 1, edgeYU - 1 - radius) 

loop
    %ball will stop moving and "End of Program" will be displayed once user provides inputs a keystroke
   
    % right                  
    if direction = 'a' then                                                                    
	loop 
	    var leftBorder : int := edgeXL + 1 + radius
	    exit when centreX <= leftBorder 
	    Draw.FillOval (centreX, centreY, radius, radius, blue)
	    delay (5)
	    Draw.FillOval (centreX, centreY, radius, radius, colorbg)
	    centreX := centreX - speed   
	    if hasch = true then
		getch (direction)
		exit
	    end if  
	    
	end loop
    
    % left
    elsif direction = 'd' then                                    
	loop
	    var rightBorder : int := edgeXR - 1 - radius
	    exit when centreX >= rightBorder                            
		Draw.FillOval (centreX, centreY, radius, radius, blue)
		delay (5) 
		Draw.FillOval (centreX, centreY, radius, radius, colorbg) 
		centreX := centreX + speed  
		if hasch = true then
		    getch (direction)
		    exit
		end if      
	end loop
    
	% up  
	elsif direction = 's' then                                    
	loop
	%ball no longer moves downward when y-coordiate of its centre is smaller or equal to pixel 50. So, the ball remains within the rectangular frame
	    var lowerBorder : int := radius + 1 + edgeYD
	    exit when centreY <= lowerBorder                             
		Draw.FillOval (centreX, centreY, radius, radius, blue) 
		delay (5) 
		Draw.FillOval (centreX, centreY, radius, radius, colorbg)
		centreY := centreY - speed
		if hasch = true then
		    getch (direction)
		    exit
		end if 
	end loop
    
    elsif direction = 'w' then                                                        
	loop
	    var upperBorder : int := edgeYU - 1 - radius
	    exit when centreY >= upperBorder                            
	    Draw.FillOval (centreX, centreY, radius, radius, blue) 
	    delay (5)                                               
	    Draw.FillOval (centreX, centreY, radius, radius, colorbg)
	    centreY:= centreY + speed   
	    if hasch = true then
	       getch (direction)
	       exit
	    end if
	end loop                                                      
    end if
end loop  
				   
put "End of Program" ..  
Draw.FillOval (centreX, centreY, radius, radius, blue) 
	



				      
				      


