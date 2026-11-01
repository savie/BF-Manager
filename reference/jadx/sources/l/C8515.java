package l;

import android.util.Pair;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.۠᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes4.dex */
public final class C8515 extends AbstractC13480 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C18334 f29492;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16667 f29493;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10840 f29494;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f29495;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19804 f29496;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8515(C19804 c19804, C9221 c9221, C1777 c1777, C16667 c16667) {
        super(c9221, c1777);
        this.f29496 = c19804;
        this.f29493 = c16667;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۘ */
    public final void mo11186(int i) {
        Pair pair = (Pair) this.f29493.get(i);
        C13638.requireNonNull(pair);
        C10840 c10840 = (C10840) pair.first;
        this.f29494 = c10840;
        this.f29492 = (C18334) pair.second;
        this.f29495 = this.f29496.f63574.m46690(c10840.m27169());
        C16737.m39273(new Runnable() { // from class: l.ᩴ᩻᩹
            @Override // java.lang.Runnable
            public final void run() {
                C8515 c8515 = this.f61688;
                c8515.f44565.m5832(c8515.f29494.m27170());
            }
        });
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹ */
    public final ISequentialOutStream mo11194() {
        return new C7861(this.f29495);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩶ */
    public final void mo11193() {
        this.f29494.m27173(this.f29495);
        C19804 c19804 = this.f29496;
        c19804.f63577.add(new C23540(this.f29495, this.f29494.m27170(), this.f29492.m42573()));
        c19804.f63575.add(this.f29492.m42573());
    }
}
