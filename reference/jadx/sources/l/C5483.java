package l;

import android.content.ClipboardManager;
import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes3.dex */
public final class C5483 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f19087;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f19088;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f19089;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f19090;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7210 f19091;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7956 f19092;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23383 f19093;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19094;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3679 f19095;

    public C5483(C23383 c23383, AbstractActivityC17204 abstractActivityC17204, C3679 c3679, C12628 c12628, int i, Context context) {
        this.f19093 = c23383;
        this.f19088 = abstractActivityC17204;
        this.f19095 = c3679;
        this.f19089 = c12628;
        this.f19094 = i;
        this.f19087 = context;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f19092 = this.f19093.f75695.m44374();
        AbstractActivityC17204 abstractActivityC17204 = this.f19088;
        if (abstractActivityC17204 != null) {
            m8193(abstractActivityC17204, R.string.MT_Protector, 200, new Runnable() { // from class: l.۫ۜᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    C5483.m16311(this.f41494);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m16311(C5483 c5483) {
        c5483.f7780.m33188((Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m16310() {
        if (this.f19095.m11971()) {
            return true;
        }
        C13511 c13511 = this.f7780;
        if (c13511 != null && c13511.m33196()) {
            return true;
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f19088;
        return (abstractActivityC17204 != null && (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed())) || !this.f19093.m52547(this.f19089);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ܳۜᩴ] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        int i = this.f19094;
        C23383 c23383 = this.f19093;
        try {
            C7210 c7210M21661 = this.f19092.m21661(c23383.f75693, c23383.f75694, new InterfaceC7509() { // from class: l.ܳۜᩴ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f49500.m16310();
                }
            });
            this.f19091 = c7210M21661;
            String strM12910 = C3991.m12910(c7210M21661, c23383.f75691, i, new InterfaceC7509() { // from class: l.ܳۜᩴ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f49500.m16310();
                }
            });
            this.f19090 = strM12910;
            if (strM12910.length() > 524288 && i < 5) {
                throw new C3245();
            }
        } finally {
            C7956 c7956 = this.f19092;
            if (c7956 != null) {
                c7956.close();
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (m16310()) {
            return;
        }
        if (C3991.m12912(this.f19089, this.f19093, this.f19088)) {
            ((ClipboardManager) this.f19087.getSystemService("clipboard")).setText(this.f19090);
            C22673.m51152(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (m16310() || (exc instanceof C15923)) {
            return;
        }
        boolean z = exc instanceof C3245;
        AbstractActivityC17204 abstractActivityC17204 = this.f19088;
        C23383 c23383 = this.f19093;
        C12628 c12628 = this.f19089;
        if (z) {
            if (C3991.m12912(c12628, c23383, abstractActivityC17204)) {
                C22673.m51152(R.string.MT_Protector);
            }
        } else if (exc instanceof IOException) {
            if (C3991.m12912(c12628, c23383, abstractActivityC17204)) {
                c12628.m31361((IOException) exc);
            }
        } else if (C3991.m12912(c12628, c23383, abstractActivityC17204)) {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C7956 c7956 = this.f19092;
        if (c7956 != null) {
            c7956.close();
        }
        C7210 c7210 = this.f19091;
        if (c7210 != null) {
            try {
                c7210.close();
            } catch (IOException unused) {
            }
        }
        this.f19095.close();
        m8196();
    }
}
