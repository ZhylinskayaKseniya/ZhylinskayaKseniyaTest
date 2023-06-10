package Core.Exceptions;


    public class NoDataFound extends AssertionError {

        private NoDataFound(String detailMessage) {
            super(detailMessage);
        }


        public NoDataFound(Object detailMessage) {
            this(String.valueOf(detailMessage));
            if (detailMessage instanceof Throwable)
                initCause((Throwable) detailMessage);
        }

    }

