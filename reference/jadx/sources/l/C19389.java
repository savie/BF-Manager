package l;

import java.util.concurrent.Executor;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ᩳ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes5.dex */
public final class C19389 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21627 f62635;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f62636;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3727 f62637;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10438 f62638;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f62639;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19959 f62640;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5789 f62641;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f62642;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f62643;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16207 f62644;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Executor f62645;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f62646;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3025 f62647;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f62648;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f62649;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20925 f62650;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C0744 f62651;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15508 f62652;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20661 f62653;

    public C19389(C10438 c10438, C18643 c18643, C15508 c15508, C19959 c19959) {
        this.f62638 = c10438;
        C20661 c20661 = c18643.f60613;
        this.f62653 = c20661;
        this.f62642 = c18643.f60622;
        this.f62639 = c18643.f60620;
        int i = c18643.f60621;
        this.f62649 = i;
        int i2 = c18643.f60626;
        this.f62636 = i2;
        int i3 = c18643.f60623;
        this.f62648 = i3;
        this.f62643 = c18643.f60619;
        this.f62640 = c19959;
        this.f62652 = c15508;
        this.f62635 = c18643.f60615;
        this.f62637 = c18643.f60614;
        this.f62650 = c18643.f60624;
        if (c15508.length() != i) {
            throw new IllegalArgumentException("Stable syntax text length changed during request");
        }
        C14913 c14913M35881 = c18643.f60617 == null ? c18643.f60616 : c18643.f60616.m35881(c18643.f60617);
        C8202 c8202 = new C8202(this);
        C20925 c20925 = c18643.f60624;
        c20661.getClass();
        C16207 c16207 = new C16207(c20661, c15508, c8202, i2, i3, c14913M35881, c20925);
        this.f62644 = c16207;
        c16207.m38507(this.f62635);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44846() {
        this.f62647 = null;
        this.f62645 = null;
        this.f62641 = null;
        this.f62644.m38513();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44847(C3025 c3025, Executor executor, C5789 c5789) {
        this.f62647 = c3025;
        this.f62645 = executor;
        this.f62641 = c5789;
        this.f62644.m38506(c3025, executor, c5789);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC17699 m44845(int i, long j, C24655 c24655) {
        try {
            EnumC17699 enumC17699M38504 = this.f62644.m38504(i, j, c24655);
            if (this.f62644.m38514()) {
                m44844();
                return EnumC17699.YIELDED;
            }
            if (enumC17699M38504 == EnumC17699.COMPLETED) {
                m44842();
                this.f62652 = null;
            }
            return enumC17699M38504;
        } catch (Error | RuntimeException e) {
            if (this.f62644.m38508() == EnumC17699.ABORTED) {
                this.f62638.m26788(this);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m44844() {
        this.f62644.m38503();
        C14913 c14913M38517 = this.f62644.m38517();
        C20925 c20925M38505 = this.f62644.m38505();
        int i = this.f62649;
        C20661 c20661 = this.f62653;
        C3727 c3727M12136 = C3727.m12130(c20661, i).m12136(c20925M38505);
        this.f62637 = c3727M12136;
        this.f62650 = c3727M12136.m12134(c20661, this.f62636);
        this.f62644.getClass();
        this.f62644.m38513();
        C15508 c15508 = this.f62652;
        C8202 c8202 = new C8202(this);
        C20925 c20925 = this.f62650;
        c20661.getClass();
        C17359.requireNonNull(c15508, TextBundle.TEXT_ENTRY);
        C16207 c16207 = new C16207(c20661, c15508, c8202, this.f62636, this.f62648, c14913M38517, c20925);
        this.f62644 = c16207;
        this.f62635 = null;
        C3025 c3025 = this.f62647;
        if (c3025 != null) {
            c16207.m38506(c3025, this.f62645, this.f62641);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m44842() {
        try {
            if (m44837()) {
                this.f62638.m26788(this);
                return;
            }
            C1270 c1270M38511 = this.f62644.m38511();
            if (c1270M38511.m4628() != this.f62648 - this.f62636) {
                throw new IllegalStateException("Window style length differs from requested range");
            }
            C8246 c8246M38510 = this.f62644.m38510();
            if (c8246M38510.m22191() != this.f62648 - this.f62636 || c8246M38510.m22193(0) != this.f62653.f66265) {
                throw new IllegalStateException("Window context differs from requested range");
            }
            C20925 c20925M38509 = this.f62644.m38509();
            if (c20925M38509.m47807() == this.f62653) {
                int iM47798 = c20925M38509.m47798();
                int i = this.f62649;
                if (iM47798 == i) {
                    C3727 c3727M12132 = this.f62637;
                    if (c3727M12132 == null) {
                        c3727M12132 = C3727.m12130(this.f62653, i);
                    }
                    if (this.f62650 != null && this.f62644.m38518() >= 0) {
                        c3727M12132 = c3727M12132.m12132(this.f62650);
                    }
                    C3727 c3727M12136 = c3727M12132.m12136(c20925M38509);
                    if (c3727M12136.m12137() != this.f62653 || c3727M12136.m12135() != this.f62649) {
                        throw new IllegalStateException("Window checkpoint cache identity differs from request");
                    }
                    C14913 c14913M38520 = this.f62644.m38520();
                    if (c14913M38520.m35882() != this.f62653 || c14913M38520.m35884() != this.f62649) {
                        throw new IllegalStateException("Window restart identity differs from request");
                    }
                    if (m44837()) {
                        this.f62638.m26788(this);
                        return;
                    }
                    C20661 c20661 = this.f62653;
                    long j = this.f62639;
                    int i2 = this.f62649;
                    int i3 = this.f62636;
                    int i4 = this.f62648;
                    this.f62644.getClass();
                    this.f62651 = new C0744(c20661, j, i2, i3, i4, c1270M38511, c8246M38510, c14913M38520, c3727M12136, this.f62635);
                    return;
                }
            }
            throw new IllegalStateException("Window checkpoint identity differs from request");
        } catch (Error | RuntimeException e) {
            this.f62638.m26788(this);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean m44837() {
        if (this.f62646) {
            return true;
        }
        if (C12500.m31039(this.f62640.f64160)) {
            this.f62646 = true;
        }
        return this.f62646;
    }
}
