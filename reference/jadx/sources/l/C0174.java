package l;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes2.dex */
public final class C0174 extends MediaSession.Callback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16403 f1279;

    public C0174(AbstractC16403 abstractC16403) {
        this.f1279 = abstractC16403;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        C1148.m4220(bundle);
        m1371(c5819M1370);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                C22316 c22316 = c5819M1370.f19774;
                InterfaceC21341 interfaceC21341M49481 = c22316.m49481();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", interfaceC21341M49481 == null ? null : interfaceC21341M49481.asBinder());
                InterfaceC23389 interfaceC23389M49485 = c22316.m49485();
                if (interfaceC23389M49485 != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(am.av, new C12100(interfaceC23389M49485));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
        }
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return false;
        }
        m1371(c5819M1370);
        boolean zMo38612 = this.f1279.mo38612(intent);
        c5819M1370.mo16003((C16094) null);
        return zMo38612 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        this.f1279.mo38614();
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        C1148.m4220(bundle);
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        C1148.m4220(bundle);
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        C1148.m4220(bundle);
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        this.f1279.mo38609();
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        this.f1279.mo38613();
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        this.f1279.mo38608();
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        this.f1279.mo38610(j);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        C5113.m14259(rating);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        C1148.m4220(bundle);
        m1371(c5819M1370);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                C1148.m4220(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    C1148.m4220(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    C1148.m4220(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    C1148.m4220(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    C1148.m4220(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                }
            }
        } catch (BadParcelableException unused) {
        }
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        C1148.m4220(bundle);
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        C1148.m4220(bundle);
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        C1148.m4220(bundle);
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        C5819 c5819M1370 = m1370();
        if (c5819M1370 == null) {
            return;
        }
        m1371(c5819M1370);
        c5819M1370.mo16003((C16094) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1371(C5819 c5819) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = c5819.f19778;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c5819.mo16003(new C16094(str, -1, -1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5819 m1370() {
        C5819 c5819;
        synchronized (this.f1279.f52775) {
            c5819 = (C5819) this.f1279.f52774.get();
        }
        if (c5819 == null || this.f1279 != c5819.mo16002()) {
            return null;
        }
        return c5819;
    }
}
