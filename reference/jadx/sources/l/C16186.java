package l;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܺ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16186 implements InterfaceC8530 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f52266;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11601 f52267;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final MediaPlayer f52268;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f52269;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f52270;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final RunnableC19008 f52271;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21124 f52272;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f52273;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f52274;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C13689 f52275;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21124 f52276;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f52277;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f52278;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC7824 f52279;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f52280;

    public C16186(C11601 c11601, final InterfaceC7824 interfaceC7824) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f52268 = mediaPlayer;
        this.f52273 = true;
        this.f52269 = -1;
        this.f52270 = new AtomicInteger();
        this.f52279 = interfaceC7824;
        this.f52267 = c11601;
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.ᩳ᩷۬
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C16186.m38279(this.f58393, interfaceC7824);
            }
        });
        this.f52271 = new RunnableC19008(0, this);
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.۠᩷۬
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return C16186.m38281(this.f29268, interfaceC7824, i, i2);
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: l.᩵᩷۬
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                C16186.m38282(this.f63283);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38279(C16186 c16186, InterfaceC7824 interfaceC7824) {
        synchronized (c16186) {
            C16737.m39278().removeCallbacksAndMessages(c16186.f52271);
            int currentPosition = c16186.f52268.getCurrentPosition();
            if (currentPosition != c16186.f52269 && currentPosition >= c16186.f52266) {
                c16186.f52266 = currentPosition;
                c16186.f52269 = currentPosition;
                ((C19113) c16186.f52279).mo20647(currentPosition);
            }
            ((C19113) interfaceC7824).mo20644();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38275(C16186 c16186) {
        synchronized (c16186) {
            if (c16186.isPlaying()) {
                int currentPosition = c16186.f52268.getCurrentPosition();
                if (currentPosition != c16186.f52269 && currentPosition >= c16186.f52266) {
                    c16186.f52266 = currentPosition;
                    c16186.f52269 = currentPosition;
                    ((C19113) c16186.f52279).mo20647(currentPosition);
                }
                Handler handlerM39278 = C16737.m39278();
                RunnableC19008 runnableC19008 = c16186.f52271;
                handlerM39278.postAtTime(runnableC19008, runnableC19008, SystemClock.uptimeMillis() + 10);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m38281(C16186 c16186, InterfaceC7824 interfaceC7824, int i, int i2) {
        C13689 c13689;
        if (!c16186.f52280 || (c13689 = c16186.f52275) == null) {
            return false;
        }
        c16186.f52280 = false;
        ((C23200) interfaceC7824).mo18747(c13689, new Exception(C2271.m6967("MediaPlayer error: what=", i, i2, ", extra=")));
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38282(C16186 c16186) {
        synchronized (c16186) {
            C21124 c21124 = c16186.f52272;
            if (c21124 == null) {
                return;
            }
            C21124 c21125 = c16186.f52276;
            if (c21125 != null) {
                c16186.f52272 = c21125;
                c16186.f52276 = null;
                c16186.f52268.seekTo(c21125.position());
            } else {
                c16186.f52272 = null;
            }
            Runnable runnableM47550 = c21124.m47550();
            if (runnableM47550 != null) {
                runnableM47550.run();
            }
        }
    }

    @Override // l.InterfaceC8530
    public final void reset() {
        this.f52274 = 0;
        this.f52270.incrementAndGet();
        synchronized (this) {
            this.f52272 = null;
            this.f52276 = null;
        }
        this.f52278 = false;
        this.f52280 = false;
        this.f52273 = true;
        this.f52275 = null;
        C16737.m39278().removeCallbacksAndMessages(this.f52271);
        try {
            this.f52268.reset();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38278(C16186 c16186, int i, C13689 c13689, C20979 c20979, long j) {
        if (c16186.m38280(i)) {
            ((C23200) c16186.f52279).mo18748(c13689, c20979, j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38277(C16186 c16186, int i, C13689 c13689, Exception exc) {
        if (c16186.m38280(i)) {
            ((C23200) c16186.f52279).mo18749(c13689, exc);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38276(final C16186 c16186, final int i, final C13689 c13689) throws Throwable {
        C7096 c7096M18967;
        C11601 c11601 = c16186.f52267;
        MediaPlayer mediaPlayer = c16186.f52268;
        try {
            if (c16186.m38280(i)) {
                c16186.f52280 = false;
                synchronized (c16186) {
                    c16186.f52272 = null;
                    c16186.f52276 = null;
                }
                mediaPlayer.reset();
                InterfaceC2557 interfaceC2557M7401 = C2427.m7401(c13689);
                c11601.m28929(interfaceC2557M7401);
                if (c16186.m38280(i)) {
                    C1388 c1388M28930 = c11601.m28930(interfaceC2557M7401);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(new C7719(c1388M28930, false));
                    C20979 c20979 = new C20979(c13689, mediaMetadataRetriever);
                    C19431.m44468(mediaMetadataRetriever);
                    if (c20979.f68323 && (c7096M18967 = C7096.m18967(c1388M28930)) != null) {
                        c20979 = new C20979(c13689, c7096M18967.m18969(), c7096M18967.m18970(), c7096M18967.m18971());
                    }
                    final C20979 c209710 = c20979;
                    if (!c16186.m38280(i)) {
                        C19431.m44468(c1388M28930);
                        return;
                    }
                    mediaPlayer.setDataSource(new C7719(c1388M28930, true));
                    mediaPlayer.prepare();
                    if (!c16186.m38280(i)) {
                        C19431.m44468(c1388M28930);
                        return;
                    }
                    mediaPlayer.setLooping(false);
                    c16186.f52269 = -1;
                    c16186.f52266 = 0;
                    c16186.f52275 = c13689;
                    c16186.f52278 = false;
                    c16186.f52280 = true;
                    final long duration = mediaPlayer.getDuration();
                    C16737.m39273(new Runnable() { // from class: l.ۤ᩷۬
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16186.m38278(this.f36092, i, c13689, c209710, duration);
                        }
                    });
                    if (c16186.m38280(i)) {
                        c11601.m28921(interfaceC2557M7401);
                    }
                }
            }
        } catch (Exception e) {
            if (0 != 0) {
                C19431.m44468(null);
            }
            if (c16186.m38280(i)) {
                c16186.f52278 = false;
                C16737.m39273(new RunnableC5001(c16186, i, c13689, e, 1));
            }
        }
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ */
    public final void mo20298() {
        MediaPlayer mediaPlayer = this.f52268;
        if (this.f52277) {
            return;
        }
        this.f52274 = 0;
        this.f52270.incrementAndGet();
        synchronized (this) {
            this.f52272 = null;
            this.f52276 = null;
        }
        C16737.m39278().removeCallbacksAndMessages(this.f52271);
        if (isPlaying()) {
            mediaPlayer.stop();
        }
        this.f52278 = false;
        this.f52280 = false;
        this.f52275 = null;
        this.f52277 = true;
        ExecutorService executorService = C4716.f16636;
        C13638.requireNonNull(mediaPlayer);
        executorService.execute(new RunnableC3185(5, mediaPlayer));
        C11601 c11601 = this.f52267;
        c11601.m28927();
        c11601.m28928();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m38280(int i) {
        return i != 0 && !this.f52277 && i == this.f52274 && i == this.f52270.get();
    }

    @Override // l.InterfaceC8530
    public final void pause() {
        if (this.f52277 || this.f52278) {
            return;
        }
        if (this.f52280) {
            try {
                if (this.f52273) {
                    return;
                }
                C16737.m39278().removeCallbacksAndMessages(this.f52271);
                this.f52268.pause();
                this.f52273 = true;
                ((C19113) this.f52279).mo20648(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC8530
    public final void start() {
        if (this.f52277 || this.f52278) {
            return;
        }
        if (this.f52280) {
            try {
                if (!isPlaying()) {
                    Handler handlerM39278 = C16737.m39278();
                    RunnableC19008 runnableC19008 = this.f52271;
                    handlerM39278.postAtTime(runnableC19008, runnableC19008, SystemClock.uptimeMillis() + 10);
                    this.f52268.start();
                    this.f52273 = false;
                    ((C19113) this.f52279).mo20648(true);
                    mo20299(C2758.f10570[C2758.m8418()]);
                    return;
                }
                this.f52273 = false;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo20296() {
        return this.f52277;
    }

    @Override // l.InterfaceC8530
    public final int getCurrentPosition() {
        int iMax;
        if (this.f52280) {
            synchronized (this) {
                try {
                    try {
                        iMax = Math.max(this.f52268.getCurrentPosition(), 0);
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

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ */
    public final void mo20299(float f) {
        if (!this.f52280 || this.f52273) {
            return;
        }
        MediaPlayer mediaPlayer = this.f52268;
        if (mediaPlayer.getPlaybackParams().getSpeed() != f) {
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setSpeed(f);
            try {
                mediaPlayer.setPlaybackParams(playbackParams);
            } catch (Exception unused) {
            }
        }
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ */
    public final void mo20300(int i, RunnableC11352 runnableC11352) {
        if (this.f52280) {
            synchronized (this) {
                this.f52266 = i;
                C21124 c21124 = this.f52272;
                if (c21124 != null) {
                    if (i == c21124.position()) {
                        this.f52272 = new C21124(i, runnableC11352);
                        this.f52276 = null;
                    } else {
                        this.f52276 = new C21124(i, runnableC11352);
                    }
                } else {
                    this.f52272 = new C21124(i, runnableC11352);
                    this.f52268.seekTo(i);
                }
            }
        }
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo20303() {
        return this.f52280;
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ */
    public final void mo20301(final C13689 c13689) {
        if (!this.f52278 && !this.f52277) {
            final int iIncrementAndGet = this.f52270.incrementAndGet();
            this.f52274 = iIncrementAndGet;
            this.f52275 = null;
            this.f52278 = true;
            this.f52273 = true;
            C16737.m39278().removeCallbacksAndMessages(this.f52271);
            C4716.f16636.execute(new Runnable() { // from class: l.ۡ᩷۬
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C16186.m38276(this.f31073, iIncrementAndGet, c13689);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo20302() {
        return this.f52278;
    }

    @Override // l.InterfaceC8530
    public final boolean isPlaying() {
        try {
            return this.f52280 && this.f52268.isPlaying();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ܰ */
    public final void mo20304() {
        synchronized (this) {
            mo20300(0, (RunnableC11352) null);
            if (this.f52273) {
                return;
            }
            Handler handlerM39278 = C16737.m39278();
            RunnableC19008 runnableC19008 = this.f52271;
            handlerM39278.postAtTime(runnableC19008, runnableC19008, SystemClock.uptimeMillis() + 10);
            this.f52268.start();
        }
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۖ */
    public final void mo20297() {
        synchronized (this) {
            mo20300(0, (RunnableC11352) null);
        }
    }
}
