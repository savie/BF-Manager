package l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68TO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11853 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18412 f38182;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f38183 = 1.0f;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f38184 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC2159 f38185;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f38186;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Handler f38187;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C2379 f38188;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC6908 f38189;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29695(C11853 c11853, int i) {
        c11853.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                c11853.m29694(4);
                return;
            }
            InterfaceC2159 interfaceC2159 = c11853.f38185;
            if (interfaceC2159 != null) {
                ((C11240) interfaceC2159).m28444(0);
            }
            c11853.m29694(3);
            return;
        }
        if (i == -1) {
            InterfaceC2159 interfaceC21510 = c11853.f38185;
            if (interfaceC21510 != null) {
                ((C11240) interfaceC21510).m28444(-1);
            }
            c11853.m29696();
            c11853.m29694(1);
            return;
        }
        if (i != 1) {
            j$$ExternalSyntheticOutline0.m(i, "Unknown focus change type: ");
            return;
        }
        c11853.m29694(2);
        InterfaceC2159 interfaceC21511 = c11853.f38185;
        if (interfaceC21511 != null) {
            ((C11240) interfaceC21511).m28444(1);
        }
    }

    public C11853(final Context context, Looper looper, InterfaceC2159 interfaceC2159) {
        this.f38189 = C11139.m28097(new InterfaceC6908() { // from class: l.ۚ᩶ۙ
            @Override // l.InterfaceC6908
            public final Object get() {
                return C8345.m22450(context);
            }
        });
        this.f38185 = interfaceC2159;
        this.f38187 = new Handler(looper);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m29697() {
        return this.f38183;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29699(C18412 c18412) {
        if (C17359.equals(this.f38182, c18412)) {
            return;
        }
        this.f38182 = c18412;
        int i = c18412 == null ? 0 : 1;
        this.f38186 = i;
        C20782.m47564("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29700() {
        this.f38185 = null;
        m29696();
        m29694(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [l.۫᩶ۙ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29698(int i, boolean z) {
        int i2;
        C9836 c9836M8079;
        if (i == 1 || (i2 = this.f38186) != 1) {
            m29696();
            m29694(0);
            return 1;
        }
        if (!z) {
            int i3 = this.f38184;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.f38184 != 2) {
            C2379 c2379 = this.f38188;
            if (c2379 == null) {
                if (c2379 == null) {
                    c9836M8079 = new C9836(i2);
                } else {
                    c9836M8079 = c2379.m8079();
                }
                C18412 c18412 = this.f38182;
                c18412.getClass();
                c9836M8079.m25613(c18412);
                c9836M8079.m25614(false);
                c9836M8079.m25612(new AudioManager.OnAudioFocusChangeListener() { // from class: l.۫᩶ۙ
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i4) {
                        C11853.m29695(this.f42554, i4);
                    }
                }, this.f38187);
                this.f38188 = c9836M8079.m25611();
            }
            if (C8345.m22453((AudioManager) this.f38189.get(), this.f38188) == 1) {
                m29694(2);
                return 1;
            }
            m29694(1);
            return -1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m29696() {
        int i = this.f38184;
        if (i == 1 || i == 0 || this.f38188 == null) {
            return;
        }
        C8345.m22452((AudioManager) this.f38189.get(), this.f38188);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29694(int i) {
        if (this.f38184 == i) {
            return;
        }
        this.f38184 = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f38183 == f) {
            return;
        }
        this.f38183 = f;
        InterfaceC2159 interfaceC2159 = this.f38185;
        if (interfaceC2159 != null) {
            ((C11240) interfaceC2159).m28457();
        }
    }
}
