package l;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۧ᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8IT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11290 implements InterfaceC13136 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC19841 f38119;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Surface f38120;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14197 f38121;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7648 f38122;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f38123;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Executor f38124;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C16313 f38125;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC5374 f38126;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f38127;

    @Override // l.InterfaceC13136
    public final boolean isInitialized() {
        return true;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28283() {
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo28294(C7648 c7648) {
        return true;
    }

    public C11290(C16313 c16313, InterfaceC11593 interfaceC11593) {
        this.f38125 = c16313;
        c16313.m38465(interfaceC11593);
        this.f38121 = new C14197(new C6350(this), c16313);
        this.f38127 = new ArrayDeque();
        this.f38122 = new C10471().m26497();
        this.f38123 = -9223372036854775807L;
        this.f38126 = InterfaceC5374.f18571;
        this.f38124 = new ExecutorC16229();
        this.f38119 = new C20462();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo28297() {
        this.f38125.m38468();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo28282() {
        this.f38125.m38459();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28290(InterfaceC5374 interfaceC5374, Executor executor) {
        this.f38126 = interfaceC5374;
        this.f38124 = executor;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo28281() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo28300(boolean z) {
        if (z) {
            this.f38125.m38467();
        }
        this.f38121.m34284();
        this.f38127.clear();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo28295(boolean z) {
        return this.f38125.m38466(z);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo28280() {
        this.f38121.m34289();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo28301() {
        return this.f38121.m34290();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Surface mo28296() {
        Surface surface = this.f38120;
        C2023.m6508(surface);
        return surface;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28292(InterfaceC19841 interfaceC19841) {
        this.f38119 = interfaceC19841;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28284(float f) {
        this.f38125.m38469(f);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28289(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28286(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28288(Surface surface, C5283 c5283) {
        this.f38120 = surface;
        this.f38125.m38464(surface);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo28302() {
        this.f38120 = null;
        this.f38125.m38464((Surface) null);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28285(int i) {
        this.f38125.m38470(i);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28291(C7648 c7648, long j, int i, List list) {
        C2023.m6510(list.isEmpty());
        int i2 = c7648.f25246;
        int i3 = c7648.f25253;
        C7648 c7649 = this.f38122;
        int i4 = c7649.f25246;
        C14197 c14197 = this.f38121;
        if (i2 != i4 || i3 != c7649.f25253) {
            c14197.m34285(i2, i3);
        }
        float f = c7648.f25273;
        if (f != this.f38122.f25273) {
            this.f38125.m38462(f);
        }
        this.f38122 = c7648;
        if (j != this.f38123) {
            c14197.m34286(i, j);
            this.f38123 = j;
        }
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo28299() {
        this.f38125.m38461();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo28293(long j, InterfaceC22308 interfaceC22308) {
        this.f38127.add(interfaceC22308);
        this.f38121.m34287(j);
        this.f38124.execute(new Runnable() { // from class: l.֡᩹ܰ
            @Override // java.lang.Runnable
            public final void run() {
                this.f2977.f38126.mo7955();
            }
        });
        return true;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28287(long j, long j2) {
        try {
            this.f38121.m34288(j, j2);
        } catch (C2170 e) {
            throw new C1140(e, this.f38122);
        }
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo28298(boolean z) {
        this.f38125.m38471(z);
    }
}
