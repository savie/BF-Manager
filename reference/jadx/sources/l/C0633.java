package l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.֡᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68TO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0633 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC20390 f2734;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23949 f2735;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2708 f2736;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Handler f2737;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15431 f2740;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f2741;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f2739 = 1.0f;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f2738 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2920(C0633 c0633, int i) {
        c0633.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                c0633.m2919(4);
                return;
            }
            InterfaceC20390 interfaceC20390 = c0633.f2734;
            if (interfaceC20390 != null) {
                ((C0530) interfaceC20390).m2522(0);
            }
            c0633.m2919(3);
            return;
        }
        if (i == -1) {
            InterfaceC20390 interfaceC20391 = c0633.f2734;
            if (interfaceC20391 != null) {
                ((C0530) interfaceC20391).m2522(-1);
            }
            c0633.m2921();
            c0633.m2919(1);
            return;
        }
        if (i != 1) {
            C7309.m19506(i, "Unknown focus change type: ");
            return;
        }
        c0633.m2919(2);
        InterfaceC20390 interfaceC20392 = c0633.f2734;
        if (interfaceC20392 != null) {
            ((C0530) interfaceC20392).m2522(1);
        }
    }

    public C0633(final Context context, Looper looper, InterfaceC20390 interfaceC20390) {
        this.f2735 = C4752.m13183(new InterfaceC23949() { // from class: l.ܺ᩶ۙ
            @Override // l.InterfaceC23949
            public final Object get() {
                return C21780.m48542(context);
            }
        });
        this.f2734 = interfaceC20390;
        this.f2737 = new Handler(looper);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m2922() {
        return this.f2739;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2924(C2708 c2708) {
        if (C13638.equals(this.f2736, c2708)) {
            return;
        }
        this.f2736 = c2708;
        int i = c2708 == null ? 0 : 1;
        this.f2741 = i;
        C2023.m6506("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2925() {
        this.f2734 = null;
        m2921();
        m2919(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [l.᩷᩶ۙ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m2923(int i, boolean z) {
        int i2;
        C4140 c4140M36905;
        if (i == 1 || (i2 = this.f2741) != 1) {
            m2921();
            m2919(0);
            return 1;
        }
        if (!z) {
            int i3 = this.f2738;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.f2738 != 2) {
            C15431 c15431 = this.f2740;
            if (c15431 == null) {
                if (c15431 == null) {
                    c4140M36905 = new C4140(i2);
                } else {
                    c4140M36905 = c15431.m36905();
                }
                C2708 c2708 = this.f2736;
                c2708.getClass();
                c4140M36905.m11773(c2708);
                c4140M36905.m11775(false);
                c4140M36905.m11774(new AudioManager.OnAudioFocusChangeListener() { // from class: l.᩷᩶ۙ
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i4) {
                        C0633.m2920(this.f68723, i4);
                    }
                }, this.f2737);
                this.f2740 = c4140M36905.m11772();
            }
            if (C21780.m48545((AudioManager) this.f2735.get(), this.f2740) == 1) {
                m2919(2);
                return 1;
            }
            m2919(1);
            return -1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m2921() {
        int i = this.f2738;
        if (i == 1 || i == 0 || this.f2740 == null) {
            return;
        }
        C21780.m48544((AudioManager) this.f2735.get(), this.f2740);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2919(int i) {
        if (this.f2738 == i) {
            return;
        }
        this.f2738 = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f2739 == f) {
            return;
        }
        this.f2739 = f;
        InterfaceC20390 interfaceC20390 = this.f2734;
        if (interfaceC20390 != null) {
            ((C0530) interfaceC20390).m2519();
        }
    }
}
