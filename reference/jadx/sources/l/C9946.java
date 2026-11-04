package l;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9946 implements InterfaceC0686 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaPlayer f31885;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final RunnableC24119 f31886;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f31887;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18897 f31888;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f31889;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31890;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21569 f31891;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C18897 f31892;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14902 f31893;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f31894;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f31895;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile int f31896;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9771 f31897;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f31898;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f31899;

    /* JADX WARN: Type inference failed for: r3v2, types: [l.᩺ۜۚ] */
    public C9946(C9771 c9771, final InterfaceC21569 interfaceC21569) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f31885 = mediaPlayer;
        this.f31887 = true;
        this.f31895 = -1;
        this.f31889 = new AtomicInteger();
        this.f31891 = interfaceC21569;
        this.f31897 = c9771;
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.ۛۜۚ
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C9946.m25780(this.f21137, interfaceC21569);
            }
        });
        this.f31886 = new Runnable() { // from class: l.᩺ۜۚ
            @Override // java.lang.Runnable
            public final void run() {
                C9946.m25776(this.f77958);
            }
        };
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.ۘۜۚ
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return C9946.m25782(this.f13629, interfaceC21569, i, i2);
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: l.ܰۜۚ
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                C9946.m25783(this.f45426);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25780(C9946 c9946, InterfaceC21569 interfaceC21569) {
        synchronized (c9946) {
            C21576.m49077().removeCallbacksAndMessages(c9946.f31886);
            int currentPosition = c9946.f31885.getCurrentPosition();
            if (currentPosition != c9946.f31895 && currentPosition >= c9946.f31890) {
                c9946.f31890 = currentPosition;
                c9946.f31895 = currentPosition;
                ((C18585) c9946.f31891).mo35786(currentPosition);
            }
            ((C18585) interfaceC21569).mo35783();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25776(C9946 c9946) {
        synchronized (c9946) {
            if (c9946.isPlaying()) {
                int currentPosition = c9946.f31885.getCurrentPosition();
                if (currentPosition != c9946.f31895 && currentPosition >= c9946.f31890) {
                    c9946.f31890 = currentPosition;
                    c9946.f31895 = currentPosition;
                    ((C18585) c9946.f31891).mo35786(currentPosition);
                }
                Handler handlerM49077 = C21576.m49077();
                RunnableC24119 runnableC24119 = c9946.f31886;
                handlerM49077.postAtTime(runnableC24119, runnableC24119, SystemClock.uptimeMillis() + 10);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m25782(C9946 c9946, InterfaceC21569 interfaceC21569, int i, int i2) {
        C14902 c14902;
        if (!c9946.f31899 || (c14902 = c9946.f31893) == null) {
            return false;
        }
        c9946.f31899 = false;
        ((C13762) interfaceC21569).mo19388(c14902, new Exception(C6934.m19217("MediaPlayer error: what=", i, i2, ", extra=")));
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25783(C9946 c9946) {
        synchronized (c9946) {
            C18897 c18897 = c9946.f31888;
            if (c18897 == null) {
                return;
            }
            C18897 c18898 = c9946.f31892;
            if (c18898 != null) {
                c9946.f31888 = c18898;
                c9946.f31892 = null;
                c9946.f31885.seekTo(c18898.position());
            } else {
                c9946.f31888 = null;
            }
            Runnable runnableM43820 = c18897.m43820();
            if (runnableM43820 != null) {
                runnableM43820.run();
            }
        }
    }

    @Override // l.InterfaceC0686
    public final void reset() {
        this.f31896 = 0;
        this.f31889.incrementAndGet();
        synchronized (this) {
            this.f31888 = null;
            this.f31892 = null;
        }
        this.f31894 = false;
        this.f31899 = false;
        this.f31887 = true;
        this.f31893 = null;
        C21576.m49077().removeCallbacksAndMessages(this.f31886);
        try {
            this.f31885.reset();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25779(C9946 c9946, int i, C14902 c14902, C19093 c19093, long j) {
        if (c9946.m25781(i)) {
            ((C13762) c9946.f31891).mo19389(c14902, c19093, j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25778(C9946 c9946, int i, C14902 c14902, Exception exc) {
        if (c9946.m25781(i)) {
            ((C13762) c9946.f31891).mo19390(c14902, exc);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25777(final C9946 c9946, final int i, final C14902 c14902) throws Throwable {
        C20342 c20342M46733;
        C9771 c9771 = c9946.f31897;
        MediaPlayer mediaPlayer = c9946.f31885;
        try {
            if (c9946.m25781(i)) {
                c9946.f31899 = false;
                synchronized (c9946) {
                    c9946.f31888 = null;
                    c9946.f31892 = null;
                }
                mediaPlayer.reset();
                InterfaceC2386 interfaceC2386M3293 = C0823.m3293(c14902);
                c9771.m25475(interfaceC2386M3293);
                if (c9946.m25781(i)) {
                    C13961 c13961M25479 = c9771.m25479(interfaceC2386M3293);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(new C7710(c13961M25479, false));
                    C19093 c19093 = new C19093(c14902, mediaMetadataRetriever);
                    C20244.m46520(mediaMetadataRetriever);
                    if (c19093.f61809 && (c20342M46733 = C20342.m46733(c13961M25479)) != null) {
                        c19093 = new C19093(c14902, c20342M46733.m46735(), c20342M46733.m46734(), c20342M46733.m46736());
                    }
                    final C19093 c19094 = c19093;
                    if (!c9946.m25781(i)) {
                        C20244.m46520(c13961M25479);
                        return;
                    }
                    mediaPlayer.setDataSource(new C7710(c13961M25479, true));
                    mediaPlayer.prepare();
                    if (!c9946.m25781(i)) {
                        C20244.m46520(c13961M25479);
                        return;
                    }
                    mediaPlayer.setLooping(false);
                    c9946.f31895 = -1;
                    c9946.f31890 = 0;
                    c9946.f31893 = c14902;
                    c9946.f31894 = false;
                    c9946.f31899 = true;
                    final long duration = mediaPlayer.getDuration();
                    C21576.m49068(new Runnable() { // from class: l.֡ۜۚ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9946.m25779(this.f1536, i, c14902, c19094, duration);
                        }
                    });
                    if (c9946.m25781(i)) {
                        c9771.m25482(interfaceC2386M3293);
                    }
                }
            }
        } catch (Exception e) {
            if (0 != 0) {
                C20244.m46520(null);
            }
            if (c9946.m25781(i)) {
                c9946.f31894 = false;
                C21576.m49068(new Runnable() { // from class: l.ܿۜۚ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9946.m25778(this.f59351, i, c14902, e);
                    }
                });
            }
        }
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2977() {
        MediaPlayer mediaPlayer = this.f31885;
        if (this.f31898) {
            return;
        }
        this.f31896 = 0;
        this.f31889.incrementAndGet();
        synchronized (this) {
            this.f31888 = null;
            this.f31892 = null;
        }
        C21576.m49077().removeCallbacksAndMessages(this.f31886);
        if (isPlaying()) {
            mediaPlayer.stop();
        }
        this.f31894 = false;
        this.f31899 = false;
        this.f31893 = null;
        this.f31898 = true;
        ExecutorService executorService = C5261.f18540;
        C17359.requireNonNull(mediaPlayer);
        executorService.execute(new RunnableC16899(5, mediaPlayer));
        C9771 c9771 = this.f31897;
        c9771.m25476();
        c9771.m25474();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m25781(int i) {
        return i != 0 && !this.f31898 && i == this.f31896 && i == this.f31889.get();
    }

    @Override // l.InterfaceC0686
    public final void pause() {
        if (this.f31898 || this.f31894) {
            return;
        }
        if (this.f31899) {
            try {
                if (this.f31887) {
                    return;
                }
                C21576.m49077().removeCallbacksAndMessages(this.f31886);
                this.f31885.pause();
                this.f31887 = true;
                ((C18585) this.f31891).mo35787(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC0686
    public final void start() {
        if (this.f31898 || this.f31894) {
            return;
        }
        if (this.f31899) {
            try {
                if (!isPlaying()) {
                    Handler handlerM49077 = C21576.m49077();
                    RunnableC24119 runnableC24119 = this.f31886;
                    handlerM49077.postAtTime(runnableC24119, runnableC24119, SystemClock.uptimeMillis() + 10);
                    this.f31885.start();
                    this.f31887 = false;
                    ((C18585) this.f31891).mo35787(true);
                    mo2978(C11369.f35782[C11369.m28682()]);
                    return;
                }
                this.f31887 = false;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo2982() {
        return this.f31898;
    }

    @Override // l.InterfaceC0686
    public final int getCurrentPosition() {
        int iMax;
        if (this.f31899) {
            synchronized (this) {
                try {
                    try {
                        iMax = Math.max(this.f31885.getCurrentPosition(), 0);
                    } catch (IllegalStateException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iMax;
        }
        return 0;
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2978(float f) {
        if (!this.f31899 || this.f31887) {
            return;
        }
        MediaPlayer mediaPlayer = this.f31885;
        if (mediaPlayer.getPlaybackParams().getSpeed() != f) {
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setSpeed(f);
            try {
                mediaPlayer.setPlaybackParams(playbackParams);
            } catch (Exception unused) {
            }
        }
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2979(int i, RunnableC11872 runnableC11872) {
        if (this.f31899) {
            synchronized (this) {
                this.f31890 = i;
                C18897 c18897 = this.f31888;
                if (c18897 != null) {
                    if (i == c18897.position()) {
                        this.f31888 = new C18897(i, runnableC11872);
                        this.f31892 = null;
                    } else {
                        this.f31892 = new C18897(i, runnableC11872);
                    }
                } else {
                    this.f31888 = new C18897(i, runnableC11872);
                    this.f31885.seekTo(i);
                }
            }
        }
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2981() {
        return this.f31899;
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2980(final C14902 c14902) {
        if (!this.f31894 && !this.f31898) {
            final int iIncrementAndGet = this.f31889.incrementAndGet();
            this.f31896 = iIncrementAndGet;
            this.f31893 = null;
            this.f31894 = true;
            this.f31887 = true;
            C21576.m49077().removeCallbacksAndMessages(this.f31886);
            C5261.f18540.execute(new Runnable() { // from class: l.᩶ۜۚ
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C9946.m25777(this.f67510, iIncrementAndGet, c14902);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2983() {
        return this.f31894;
    }

    @Override // l.InterfaceC0686
    public final boolean isPlaying() {
        try {
            return this.f31899 && this.f31885.isPlaying();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2984() {
        synchronized (this) {
            mo2979(0, (RunnableC11872) null);
            if (this.f31887) {
                return;
            }
            Handler handlerM49077 = C21576.m49077();
            RunnableC24119 runnableC24119 = this.f31886;
            handlerM49077.postAtTime(runnableC24119, runnableC24119, SystemClock.uptimeMillis() + 10);
            this.f31885.start();
        }
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2985() {
        synchronized (this) {
            mo2979(0, (RunnableC11872) null);
        }
    }
}
