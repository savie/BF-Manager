package l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceHolderCallbackC1325 implements InterfaceC4168, InterfaceC19729, InterfaceC2610, InterfaceC23568, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, InterfaceC12899, InterfaceC20058, InterfaceC0667 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8782 f4759;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public SurfaceHolderCallbackC1325(C8782 c8782) {
        this.f4759 = c8782;
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo4887(C17074 c17074) {
        this.f4759.f28619.mo7244(c17074);
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4877(String str, long j, long j2) {
        this.f4759.f28619.mo7218(str, j, j2);
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4894(C15648 c15648, C17820 c17820) {
        this.f4759.f28619.mo7259(c15648, c17820);
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4889(int i, long j) {
        this.f4759.f28619.mo7248(i, j);
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4883(C18787 c18787) {
        C8782 c8782 = this.f4759;
        c8782.f28585 = c18787;
        c8782.f28576.m16608(25, new C6007(1, c18787));
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4873(long j, Object obj) {
        C8782 c8782 = this.f4759;
        c8782.f28619.mo7215(j, obj);
        if (c8782.f28610 == obj) {
            c8782.f28576.m16608(26, new C7376());
        }
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4876(String str) {
        this.f4759.f28619.mo7217(str);
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4882(C17074 c17074) {
        this.f4759.f28619.mo7232(c17074);
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4870(int i, long j) {
        this.f4759.f28619.mo7203(i, j);
    }

    @Override // l.InterfaceC4168
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4890(Exception exc) {
        this.f4759.f28619.mo7254(exc);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4895(C17074 c17074) {
        this.f4759.f28619.mo7260(c17074);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4892(String str, long j, long j2) {
        this.f4759.f28619.mo7256(str, j, j2);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4881(C15648 c15648, C17820 c17820) {
        this.f4759.f28619.mo7231(c15648, c17820);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4871(long j) {
        this.f4759.f28619.mo7213(j);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4872(long j, int i, long j2) {
        this.f4759.f28619.mo7214(j, i, j2);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4891(String str) {
        this.f4759.f28619.mo7255(str);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo4896(C17074 c17074) {
        this.f4759.f28619.mo7264(c17074);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4885(final boolean z) {
        C8782 c8782 = this.f4759;
        if (c8782.f28604 == z) {
            return;
        }
        c8782.f28604 = z;
        c8782.f28576.m16608(23, new InterfaceC19795() { // from class: l.ۢܿۙ
            @Override // l.InterfaceC19795
            public final void invoke(Object obj) {
                ((InterfaceC10582) obj).mo7239(z);
            }
        });
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4875(Exception exc) {
        this.f4759.f28619.mo7216(exc);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo4886(Exception exc) {
        this.f4759.f28619.mo7243(exc);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4880(C15253 c15253) {
        this.f4759.f28619.mo7230(c15253);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4893(C15253 c15253) {
        this.f4759.f28619.mo7258(c15253);
    }

    @Override // l.InterfaceC19729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4869(final int i) {
        this.f4759.f28579.m13883(new InterfaceC5417() { // from class: l.۟ܿۙ
            @Override // l.InterfaceC5417
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        }, new InterfaceC5417() { // from class: l.ᩳܿۙ
            @Override // l.InterfaceC5417
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        });
    }

    @Override // l.InterfaceC2610
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4878(List list) {
        this.f4759.f28576.m16608(27, new C0579(list));
    }

    @Override // l.InterfaceC2610
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4879(C11831 c11831) {
        C8782 c8782 = this.f4759;
        c8782.f28603 = c11831;
        c8782.f28576.m16608(27, new C21151(c11831));
    }

    @Override // l.InterfaceC23568
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4884(C19378 c19378) {
        C8782 c8782 = this.f4759;
        C18632 c18632M3057 = c8782.f28575.m3057();
        for (int i = 0; i < c19378.m44819(); i++) {
            c19378.m44820(i).mo12246(c18632M3057);
        }
        c8782.f28575 = c18632M3057.m43369();
        C0733 c0733M23528 = c8782.m23528();
        if (!c0733M23528.equals(c8782.f28567)) {
            c8782.f28567 = c0733M23528;
            c8782.f28576.m16604(14, new InterfaceC19795() { // from class: l.ܿܿۙ
                @Override // l.InterfaceC19795
                public final void invoke(Object obj) {
                    ((InterfaceC10582) obj).mo7221(this.f60146.f4759.f28567);
                }
            });
        }
        c8782.f28576.m16604(28, new C0249(1, c19378));
        c8782.f28576.m16603();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C8782 c8782 = this.f4759;
        if (c8782.f28595) {
            c8782.m23505(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f4759.m23501(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C8782 c8782 = this.f4759;
        if (c8782.f28595) {
            c8782.m23505((Object) null);
        }
        c8782.m23501(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C8782 c8782 = this.f4759;
        C8782.m23510(c8782, surfaceTexture);
        c8782.m23501(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f4759.m23501(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C8782 c8782 = this.f4759;
        c8782.m23505((Object) null);
        c8782.m23501(0, 0);
        return true;
    }

    @Override // l.InterfaceC12899
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4874(Surface surface) {
        this.f4759.m23505(surface);
    }

    @Override // l.InterfaceC12899
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4888() {
        this.f4759.m23505((Object) null);
    }

    @Override // l.InterfaceC0667
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890() {
        this.f4759.m23538();
    }
}
