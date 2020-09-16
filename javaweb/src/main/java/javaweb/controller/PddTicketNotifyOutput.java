package javaweb.controller;


public class PddTicketNotifyOutput {

    private TicketNotifyResponse ticketNotifyResponse;

    public TicketNotifyResponse getTicketNotifyResponse() {
        return ticketNotifyResponse;
    }

    public void setTicketNotifyResponse(TicketNotifyResponse ticketNotifyResponse) {
        this.ticketNotifyResponse = ticketNotifyResponse;
    }

    public static class TicketNotifyResponse {
        private boolean isSuccess;

        public boolean isSuccess() {
            return isSuccess;
        }

        public void setSuccess(boolean success) {
            isSuccess = success;
        }
    }
}
