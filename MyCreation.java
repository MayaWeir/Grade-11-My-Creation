/*
   Maya Weir
   Ms. Krasteva
   2018.10.15
   This program will create a story showing a soccer game between 3 fruits and 3 vegetables.
   The 3 fruits (strawberry, pineapple, grapes) and the 3 vegetables (brocoli, carrot, radish)
   will pass the ball around and eventually the pineapple will score a goal. At the end, the
   fruits will get a trophy, and there will be 3 tomatoes cheering for them.
*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c;           // The output console

    //adds the Background thread to MyCreation
    public void background ()
    {

	Background s = new Background (c);
    }


    public void StrawberryIn ()
    {
	StrawberryIn s = new StrawberryIn (c);
	s.run ();
    }


    public void PineappleIn ()
    {
	PineappleIn s = new PineappleIn (c);
	s.run ();

    }


    public void GrapeIn ()
    {
	GrapeIn s = new GrapeIn (c);
	s.run ();
    }


    public void BroccoliIn ()
    {
	BroccoliIn s = new BroccoliIn (c);
	s.run ();
    }


    public void RadishIn ()
    {
	RadishIn s = new RadishIn (c);
	s.run ();
    }


    public void CarrotIn ()
    {
	CarrotIn s = new CarrotIn (c);
	s.start ();
    }


    public void BallIn ()
    {
	BallIn s = new BallIn (c);
	s.start ();
	try
	{
	    s.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void StrawberryToBall ()
    {
	StrawberryToBall s = new StrawberryToBall (c);
	s.run ();
    }


    public void Ball1 ()
    {
	Ball1 s = new Ball1 (c);
	s.run ();
    }


    public void BrocToBall ()
    {
	BrocToBall s = new BrocToBall (c);
	s.run ();
    }


    public void Ball2 ()
    {
	Ball2 s = new Ball2 (c);
	s.run ();
    }


    public void PineappleToBall ()
    {
	PineappleToBall s = new PineappleToBall (c);
	s.run ();
    }


    public void Ball3 ()
    {
	Ball3 s = new Ball3 (c);
	s.run ();
    }


    public void GrapeToBall ()
    {
	GrapeToBall s = new GrapeToBall (c);
	s.run ();
    }


    public void GrapeWithBall ()
    {
	GrapeWithBall s = new GrapeWithBall (c);
	s.run ();
    }


    public void RadishToBall ()
    {
	RadishToBall s = new RadishToBall (c);
	s.run ();
    }


    public void Ball4 ()
    {
	Ball4 s = new Ball4 (c);
	s.run ();
    }


    public void CarrotToBall ()
    {
	CarrotToBall s = new CarrotToBall (c);
	s.run ();
    }


    public void Ball5 ()
    {
	Ball5 s = new Ball5 (c);
	s.run ();
    }


    public void BrocAway ()
    {
	BrocAway s = new BrocAway (c);
	s.start ();
    }


    public void PineappleScore ()
    {
	PineappleScore s = new PineappleScore (c);
	s.start ();
	try
	{
	    s.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void StrawberryIn2 ()
    {
	StrawberryIn2 s = new StrawberryIn2 (c);
	s.run ();
    }


    public void PineappleIn2 ()
    {
	PineappleIn2 s = new PineappleIn2 (c);
	s.run ();
    }


    public void GrapeIn2 ()
    {
	GrapeIn2 s = new GrapeIn2 (c);
	s.run ();
    }


    public void TrophyIn ()
    {
	TrophyIn s = new TrophyIn (c);
	s.run ();
    }


    public void Tomatoes ()
    {
	Tomatoes s1 = new Tomatoes (c, 330);
	s1.start ();
	try
	{
	    s1.join ();
	}
	catch (InterruptedException e)
	{
	}
	Tomatoes s2 = new Tomatoes (c, 170, Color.orange);
	s2.start ();
	try
	{
	    s2.join ();
	}
	catch (InterruptedException e)
	{
	}
	Tomatoes s3 = new Tomatoes (c, 30, Color.yellow, 30);
	s3.start ();
	try
	{
	    s3.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("The Soccer Game");
    }


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.background ();
	z.StrawberryIn ();
	z.PineappleIn ();
	z.GrapeIn ();
	z.BroccoliIn ();
	z.RadishIn ();
	z.CarrotIn ();
	z.BallIn ();
	z.StrawberryToBall ();
	z.Ball1 ();
	z.BrocToBall ();
	z.Ball2 ();
	z.PineappleToBall ();
	z.Ball3 ();
	z.GrapeToBall ();
	z.GrapeWithBall ();
	z.RadishToBall ();
	z.Ball4 ();
	z.CarrotToBall ();
	z.Ball5 ();
	z.BrocAway ();
	z.PineappleScore ();
	z.background ();
	z.StrawberryIn2 ();
	z.PineappleIn2 ();
	z.GrapeIn2 ();
	z.TrophyIn ();
	z.Tomatoes ();

    }
} // MyCreation class


