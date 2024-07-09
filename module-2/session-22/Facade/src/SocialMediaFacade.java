public class SocialMediaFacade {
    //Lớp SocialMediaFacade thực hiện tất cả các thao tác chia sẻ lên các mạng xã hội khác nhau.
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String message) {
        this.twitter.setMessage(message);
        this.linkedIn.setMessage(message);
        this.facebook.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.facebook.share();
    }
}
