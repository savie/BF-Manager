package l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceHolderCallbackC4057 implements InterfaceC11725, InterfaceC8688, InterfaceC22704, InterfaceC10722, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, InterfaceC20192, InterfaceC10513, InterfaceC4993 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15348 f14958;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public SurfaceHolderCallbackC4057(C15348 c15348) {
        this.f14958 = c15348;
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo11581(C12629 c12629) {
        this.f14958.f49995.mo2620(c12629);
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11571(String str, long j, long j2) {
        this.f14958.f49995.mo2594(str, j, j2);
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11587(C7648 c7648, C17567 c17567) {
        this.f14958.f49995.mo2633(c7648, c17567);
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11583(int i, long j) {
        this.f14958.f49995.mo2624(i, j);
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11577(final C13314 c13314) {
        C15348 c15348 = this.f14958;
        c15348.f49992 = c13314;
        c15348.f50014.m45429(25, new InterfaceC7359() { // from class: l.ۚܽۙ
            @Override // l.InterfaceC7359
            public final void invoke(Object obj) {
                ((InterfaceC19333) obj).mo2605(c13314);
            }
        });
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11567(long j, Object obj) {
        C15348 c15348 = this.f14958;
        c15348.f49995.mo2591(j, obj);
        if (c15348.f49962 == obj) {
            c15348.f50014.m45429(26, new C18855(2));
        }
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11570(String str) {
        this.f14958.f49995.mo2593(str);
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11576(C12629 c12629) {
        this.f14958.f49995.mo2604(c12629);
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11564(int i, long j) {
        this.f14958.f49995.mo2579(i, j);
    }

    @Override // l.InterfaceC11725
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11584(Exception exc) {
        this.f14958.f49995.mo2630(exc);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11589(C12629 c12629) {
        this.f14958.f49995.mo2635(c12629);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11586(String str, long j, long j2) {
        this.f14958.f49995.mo2632(str, j, j2);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11574(C7648 c7648, C17567 c17567) {
        this.f14958.f49995.mo2599(c7648, c17567);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11565(long j) {
        this.f14958.f49995.mo2589(j);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11566(long j, int i, long j2) {
        this.f14958.f49995.mo2590(j, i, j2);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11585(String str) {
        this.f14958.f49995.mo2631(str);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo11561(C12629 c12629) {
        this.f14958.f49995.mo2572(c12629);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11579(final boolean z) {
        C15348 c15348 = this.f14958;
        if (c15348.f50007 == z) {
            return;
        }
        c15348.f50007 = z;
        c15348.f50014.m45429(23, new InterfaceC7359() { // from class: l.۬ܽۙ
            @Override // l.InterfaceC7359
            public final void invoke(Object obj) {
                ((InterfaceC19333) obj).mo2615(z);
            }
        });
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11569(Exception exc) {
        this.f14958.f49995.mo2592(exc);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo11580(Exception exc) {
        this.f14958.f49995.mo2619(exc);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11575(C10099 c10099) {
        this.f14958.f49995.mo2602(c10099);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11588(C10099 c10099) {
        this.f14958.f49995.mo2634(c10099);
    }

    @Override // l.InterfaceC8688
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11563(final int i) {
        this.f14958.f49993.m33421(new InterfaceC11955() { // from class: l.᩹ܽۙ
            @Override // l.InterfaceC11955
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        }, new InterfaceC11955() { // from class: l.֨ܽۙ
            @Override // l.InterfaceC11955
            public final Object apply(Object obj) {
                return Integer.valueOf(i);
            }
        });
    }

    @Override // l.InterfaceC22704
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11572(List list) {
        this.f14958.f50014.m45429(27, new C6156(1, list));
    }

    @Override // l.InterfaceC22704
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11578(C16841 c16841) {
        C15348 c15348 = this.f14958;
        c15348.f50006 = c16841;
        c15348.f50014.m45429(27, new C15952(c16841));
    }

    @Override // l.InterfaceC10722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11573(C0987 c0987) {
        C15348 c15348 = this.f14958;
        C2398 c2398M14400 = c15348.f49981.m14400();
        for (int i = 0; i < c0987.m3789(); i++) {
            c0987.m3793(i).mo3146(c2398M14400);
        }
        c15348.f49981 = c2398M14400.m7308();
        C5221 c5221M36786 = c15348.m36786();
        if (!c5221M36786.equals(c15348.f50002)) {
            c15348.f50002 = c5221M36786;
            c15348.f50014.m45425(14, new InterfaceC7359() { // from class: l.ۖܽۙ
                @Override // l.InterfaceC7359
                public final void invoke(Object obj) {
                    ((InterfaceC19333) obj).mo2598(this.f10301.f14958.f50002);
                }
            });
        }
        c15348.f50014.m45425(28, new C9058(c0987));
        c15348.f50014.m45424();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C15348 c15348 = this.f14958;
        if (c15348.f49983) {
            c15348.m36759(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f14958.m36755(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C15348 c15348 = this.f14958;
        if (c15348.f49983) {
            c15348.m36759((Object) null);
        }
        c15348.m36755(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C15348 c15348 = this.f14958;
        C15348.m36765(c15348, surfaceTexture);
        c15348.m36755(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14958.m36755(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C15348 c15348 = this.f14958;
        c15348.m36759((Object) null);
        c15348.m36755(0, 0);
        return true;
    }

    @Override // l.InterfaceC20192
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11568(Surface surface) {
        this.f14958.m36759(surface);
    }

    @Override // l.InterfaceC20192
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11582() {
        this.f14958.m36759((Object) null);
    }

    @Override // l.InterfaceC4993
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11562() {
        this.f14958.m36788();
    }
}
