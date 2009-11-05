package net.vidageek.crawler;

/**
 * @author jonasabreu
 * 
 */
public interface ContentVisitor {

    void visit(Page page);

    void onError(String url, Status statusError);

}