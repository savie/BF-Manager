package l;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes5.dex */
public final class C17839 implements InterfaceC21569 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23807 f58525;

    public C17839(C23807 c23807) {
        this.f58525 = c23807;
    }

    @Override // l.InterfaceC21569
    /* JADX INFO: renamed from: ۙ */
    public final void mo19389(C14902 c14902, C19093 c19093, long j) {
        int iM53119;
        int i = 0;
        C23807 c23807 = this.f58525;
        c23807.f77119 = c14902;
        C21576.m49077().removeCallbacksAndMessages(C23807.f77114);
        C23807.m53121(c19093);
        C23807.m53120(j);
        C16347 c16347 = c23807.f77118;
        if (c16347 != null) {
            c23807.f77118 = null;
        }
        if (c16347 != null) {
            iM53119 = C23807.m53119(c16347.position());
        } else {
            int i2 = c23807.f77127;
            if (i2 > 0) {
                if (j <= 0 || i2 < j) {
                    i = i2;
                } else {
                    c23807.f77127 = 0;
                    if (c23807.f77126) {
                        C19331.m44716(c23807.f77123);
                    }
                }
            }
            iM53119 = i;
        }
        if (!c23807.f77125) {
            c23807.f77127 = -1;
        }
        if (iM53119 > 0) {
            C23807.m53118(iM53119);
            C16347 c16348 = new C16347(c14902, iM53119);
            c23807.f77118 = c16348;
            c23807.f77115.mo2979(iM53119, new RunnableC11872(c23807, c16348, c14902));
            return;
        }
        C3669.f12624.mo40353((Object) 0);
        C3669.f12625.mo40353((Object) 0);
        if (c23807.f77121) {
            C23807.m53115(c23807);
        }
    }

    @Override // l.InterfaceC21569
    /* JADX INFO: renamed from: ۙ */
    public final void mo35785(long j) {
        C23807.m53120(j);
    }

    @Override // l.InterfaceC21569
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19390(C14902 c14902, Exception exc) {
        exc.getClass();
        C21576.m49077().removeCallbacksAndMessages(C23807.f77114);
        boolean zM49278 = C21706.m49278(exc);
        C23807 c23807 = this.f58525;
        if (zM49278) {
            long j = c23807.f77117;
            c23807.m53126(true);
            Application applicationM49084 = C21576.m49084();
            int i = ServiceC4415.f15847;
            applicationM49084.startService(new Intent(applicationM49084, (Class<?>) ServiceC4415.class).setAction("bin.mt.media.MusicPlayerService.ACTION_EXIT").putExtra("playbackSessionId", j));
            return;
        }
        C3669.f12619.mo40353(c14902.f48685);
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = exc.toString();
        }
        C3669.f12620.mo40353(message);
        C3669.f12629.mo40353(message);
        C3669.f12616.mo40353((Object) 0);
        C3669.f12628.mo40353((Object) 0);
        C3669.f12624.mo40353((Object) 0);
        C3669.f12625.mo40353((Object) 0);
        C3669.f12621.mo40353(Boolean.FALSE);
        c23807.f77121 = false;
        Drawable drawableM42803 = C18347.m42803();
        C3669.f12623.mo40353(drawableM42803);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, config);
        drawableM42803.setBounds(0, 0, 256, 256);
        drawableM42803.draw(new Canvas(bitmapCreateBitmap));
        C3669.f12627.mo40353(bitmapCreateBitmap);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(256, 256, config);
        new Canvas(bitmapCreateBitmap2).drawColor(C20613.f66057.mo6775());
        C3669.f12615.mo40353(bitmapCreateBitmap2);
    }

    @Override // l.InterfaceC21569
    /* JADX INFO: renamed from: ۙ */
    public final void mo19388(C14902 c14902, Exception exc) {
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = exc.toString();
        }
        C3669.f12620.mo40353(message);
        C3669.f12629.mo40353(message);
        C3669.f12621.mo40353(Boolean.FALSE);
        this.f58525.f77121 = false;
    }

    @Override // l.InterfaceC21569
    /* JADX INFO: renamed from: ᩷ */
    public final void mo35786(int i) {
        if (this.f58525.f77122) {
            return;
        }
        int i2 = i / 50;
        C17930 c17930 = C3669.f12624;
        Integer num = (Integer) c17930.m40346();
        C17359.requireNonNull(num);
        if (i2 != num.intValue()) {
            c17930.mo40353(Integer.valueOf(i2));
        }
        int iM11925 = C3669.m11925(i);
        C17930 c17931 = C3669.f12625;
        Integer num2 = (Integer) c17931.m40346();
        C17359.requireNonNull(num2);
        if (iM11925 != num2.intValue()) {
            c17931.mo40353(Integer.valueOf(iM11925));
        }
    }

    @Override // l.InterfaceC21569
    /* JADX INFO: renamed from: ۙ */
    public final void mo35784(int i) {
        C3669.f12629.mo40353(C21576.m49088(R.string.MT_Protector) + " " + i + "%");
    }

    @Override // l.InterfaceC21569
    /* JADX INFO: renamed from: ᩷ */
    public final void mo35787(boolean z) {
        if (z) {
            C23807 c23807 = this.f58525;
            if (c23807.f77125) {
                c23807.f77127 = -1;
                c23807.f77125 = false;
                if (c23807.f77126) {
                    C19331.m44716(c23807.f77123);
                }
            }
        }
        C3669.f12621.mo40353(Boolean.valueOf(z));
    }

    @Override // l.InterfaceC21569
    /* JADX INFO: renamed from: ۙ */
    public final void mo35783() {
        C23807 c23807 = this.f58525;
        C11369 c11369 = c23807.f77124;
        InterfaceC0686 interfaceC0686 = c23807.f77115;
        if (c23807.f77122) {
            return;
        }
        int iM28688 = C11369.m28688();
        if (iM28688 == 1) {
            interfaceC0686.mo2984();
            return;
        }
        if (iM28688 == 3) {
            interfaceC0686.mo2985();
            c23807.f77121 = false;
            C3669.f12621.mo40353(Boolean.FALSE);
            C3669.f12625.mo40353((Object) 0);
            C3669.f12624.mo40353((Object) 0);
            C17930 c17930 = C3669.f12623;
            c17930.mo40353((Drawable) c17930.m40346());
            return;
        }
        if (c11369.size() == 1) {
            interfaceC0686.mo2984();
        } else {
            c11369.mo3298();
            c23807.m53116();
        }
    }
}
