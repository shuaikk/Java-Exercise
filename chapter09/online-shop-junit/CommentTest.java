

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testComment()
    {
        Comment comment1 = new Comment("Sally", "good", 4);
        comment1.upvote();
        assertEquals(1, comment1.getVoteCount());
        comment1.upvote();
        comment1.upvote();
        assertEquals(3, comment1.getVoteCount());
        comment1.downvote();
        assertEquals(2, comment1.getVoteCount());
    }
}

