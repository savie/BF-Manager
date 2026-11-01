package l;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes5.dex */
public final class C21935 implements InterfaceC7824 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12763 f71140;

    public C21935(C12763 c12763) {
        this.f71140 = c12763;
    }

    @Override // l.InterfaceC7824
    /* JADX INFO: renamed from: ۙ */
    public final void mo18748(C13689 c13689, C20979 c20979, long j) {
        int iM31724;
        int i = 0;
        C12763 c12763 = this.f71140;
        c12763.f42568 = c13689;
        C16737.m39278().removeCallbacksAndMessages(C12763.f42562);
        C12763.m31731(c20979);
        C12763.m31729(j);
        C0767 c0767 = c12763.f42569;
        if (c0767 != null) {
            c12763.f42569 = null;
        }
        if (c0767 != null) {
            iM31724 = C12763.m31724(c0767.position());
        } else {
            int i2 = c12763.f42575;
            if (i2 > 0) {
                if (j <= 0 || i2 < j) {
                    i = i2;
                } else {
                    c12763.f42575 = 0;
                    if (c12763.f42564) {
                        C7118.m19005(c12763.f42573);
                    }
                }
            }
            iM31724 = i;
        }
        if (!c12763.f42571) {
            c12763.f42575 = -1;
        }
        if (iM31724 > 0) {
            C12763.m31732(iM31724);
            C0767 c0768 = new C0767(c13689, iM31724);
            c12763.f42569 = c0768;
            c12763.f42565.mo20300(iM31724, new RunnableC11352(c12763, c0768, c13689));
            return;
        }
        C3589.f13222.mo23642((Object) 0);
        C3589.f13216.mo23642((Object) 0);
        if (c12763.f42574) {
            C12763.m31727(c12763);
        }
    }

    @Override // l.InterfaceC7824
    /* JADX INFO: renamed from: ۙ */
    public final void mo20646(long j) {
        C12763.m31729(j);
    }

    @Override // l.InterfaceC7824
    /* JADX INFO: renamed from: ܰ */
    public final void mo18749(C13689 c13689, Exception exc) {
        exc.getClass();
        C16737.m39278().removeCallbacksAndMessages(C12763.f42562);
        boolean zM48547 = C21788.m48547(exc);
        C12763 c12763 = this.f71140;
        if (zM48547) {
            long j = c12763.f42570;
            c12763.m31736(true);
            Application applicationM39277 = C16737.m39277();
            int i = ServiceC17701.f56205;
            applicationM39277.startService(new Intent(applicationM39277, (Class<?>) ServiceC17701.class).setAction("bin.mt.media.MusicPlayerService.ACTION_EXIT").putExtra("playbackSessionId", j));
            return;
        }
        C3589.f13213.mo23642(c13689.f45154);
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = exc.toString();
        }
        C3589.f13209.mo23642(message);
        C3589.f13210.mo23642(message);
        C3589.f13218.mo23642((Object) 0);
        C3589.f13214.mo23642((Object) 0);
        C3589.f13222.mo23642((Object) 0);
        C3589.f13216.mo23642((Object) 0);
        C3589.f13219.mo23642(Boolean.FALSE);
        c12763.f42574 = false;
        Drawable drawableM23291 = C8985.m23291();
        C3589.f13220.mo23642(drawableM23291);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, config);
        drawableM23291.setBounds(0, 0, 256, 256);
        drawableM23291.draw(new Canvas(bitmapCreateBitmap));
        C3589.f13217.mo23642(bitmapCreateBitmap);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(256, 256, config);
        new Canvas(bitmapCreateBitmap2).drawColor(C0690.f2881.mo4888());
        C3589.f13215.mo23642(bitmapCreateBitmap2);
    }

    @Override // l.InterfaceC7824
    /* JADX INFO: renamed from: ۙ */
    public final void mo18747(C13689 c13689, Exception exc) {
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = exc.toString();
        }
        C3589.f13209.mo23642(message);
        C3589.f13210.mo23642(message);
        C3589.f13219.mo23642(Boolean.FALSE);
        this.f71140.f42574 = false;
    }

    @Override // l.InterfaceC7824
    /* JADX INFO: renamed from: ܰ */
    public final void mo20647(int i) {
        if (this.f71140.f42572) {
            return;
        }
        int i2 = i / 50;
        C9186 c9186 = C3589.f13222;
        Integer num = (Integer) c9186.m44956();
        C13638.requireNonNull(num);
        if (i2 != num.intValue()) {
            c9186.mo23642(Integer.valueOf(i2));
        }
        int iM10635 = C3589.m10635(i);
        C9186 c9187 = C3589.f13216;
        Integer num2 = (Integer) c9187.m44956();
        C13638.requireNonNull(num2);
        if (iM10635 != num2.intValue()) {
            c9187.mo23642(Integer.valueOf(iM10635));
        }
    }

    @Override // l.InterfaceC7824
    /* JADX INFO: renamed from: ۙ */
    public final void mo20645(int i) {
        C3589.f13210.mo23642(C16737.m39288(R.string.MT_Protector) + " " + i + "%");
    }

    @Override // l.InterfaceC7824
    /* JADX INFO: renamed from: ܰ */
    public final void mo20648(boolean z) {
        if (z) {
            C12763 c12763 = this.f71140;
            if (c12763.f42571) {
                c12763.f42575 = -1;
                c12763.f42571 = false;
                if (c12763.f42564) {
                    C7118.m19005(c12763.f42573);
                }
            }
        }
        C3589.f13219.mo23642(Boolean.valueOf(z));
    }

    @Override // l.InterfaceC7824
    /* JADX INFO: renamed from: ۙ */
    public final void mo20644() {
        C12763 c12763 = this.f71140;
        C2758 c2758 = c12763.f42567;
        InterfaceC8530 interfaceC8530 = c12763.f42565;
        if (c12763.f42572) {
            return;
        }
        int iM8420 = C2758.m8420();
        if (iM8420 == 1) {
            interfaceC8530.mo20304();
            return;
        }
        if (iM8420 == 3) {
            interfaceC8530.mo20297();
            c12763.f42574 = false;
            C3589.f13219.mo23642(Boolean.FALSE);
            C3589.f13216.mo23642((Object) 0);
            C3589.f13222.mo23642((Object) 0);
            C9186 c9186 = C3589.f13220;
            c9186.mo23642((Drawable) c9186.m44956());
            return;
        }
        if (c2758.size() == 1) {
            interfaceC8530.mo20304();
        } else {
            c2758.mo7411();
            c12763.m31725();
        }
    }
}
