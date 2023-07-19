package cn.zjh.design.pattern.cor;

/**
 * @author zjh - kayson
 */
public class PMRequestHandler implements RequestHandler {

    private RequestHandler rh;
    public PMRequestHandler(RequestHandler rh) {
        this.rh = rh;
    }
    
    @Override
    public void handler(Request request) {
        if (request instanceof AddMoneyRequest) {
            System.out.println("要加薪, 项目经理审批!");
        } else {
            rh.handler(request);
        }
    }
}
