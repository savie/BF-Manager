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

/* JADX INFO: renamed from: l.ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C18081 extends MediaSession.Callback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0182 f59181;

    public C18081(AbstractC0182 abstractC0182) {
        this.f59181 = abstractC0182;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        C13363.m32945(bundle);
        m42114(c9876M42113);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                C15600 c15600 = c9876M42113.f31775;
                InterfaceC17335 interfaceC17335M37330 = c15600.m37330();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", interfaceC17335M37330 == null ? null : interfaceC17335M37330.asBinder());
                InterfaceC12239 interfaceC12239M37334 = c15600.m37334();
                if (interfaceC12239M37334 != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(am.av, new C15968(interfaceC12239M37334));
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
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return false;
        }
        m42114(c9876M42113);
        boolean zMo1481 = this.f59181.mo1481(intent);
        c9876M42113.mo20858((C5734) null);
        return zMo1481 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        this.f59181.mo1483();
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        C13363.m32945(bundle);
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        C13363.m32945(bundle);
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        C13363.m32945(bundle);
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        this.f59181.mo1478();
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        this.f59181.mo1482();
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        this.f59181.mo1485();
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        this.f59181.mo1479(j);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        C19573.m45174(rating);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        C13363.m32945(bundle);
        m42114(c9876M42113);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                C13363.m32945(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    C13363.m32945(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    C13363.m32945(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    C13363.m32945(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    C13363.m32945(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                }
            }
        } catch (BadParcelableException unused) {
        }
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        C13363.m32945(bundle);
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        C13363.m32945(bundle);
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        C13363.m32945(bundle);
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        C9876 c9876M42113 = m42113();
        if (c9876M42113 == null) {
            return;
        }
        m42114(c9876M42113);
        c9876M42113.mo20858((C5734) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42114(C9876 c9876) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = c9876.f31777;
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
        c9876.mo20858(new C5734(str, -1, -1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9876 m42113() {
        C9876 c9876;
        synchronized (this.f59181.f1265) {
            c9876 = (C9876) this.f59181.f1266.get();
        }
        if (c9876 == null || this.f59181 != c9876.mo20857()) {
            return null;
        }
        return c9876;
    }
}
