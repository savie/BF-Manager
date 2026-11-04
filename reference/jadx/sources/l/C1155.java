package l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֨ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6CH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1155 implements InterfaceC5754 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19054 f4261;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10103 f4262;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7867 f4263;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set f4264;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23173 f4265;

    public C1155(C7867 c7867, C19054 c19054, C10103 c10103, C23173 c23173, Set set) {
        this.f4263 = c7867;
        this.f4261 = c19054;
        this.f4262 = c10103;
        this.f4265 = c23173;
        this.f4264 = set;
    }

    @Override // l.InterfaceC5754
    public final BiConsumer accumulator() {
        return this.f4261;
    }

    @Override // l.InterfaceC5754
    public final Set characteristics() {
        return this.f4264;
    }

    @Override // l.InterfaceC5754
    public final BinaryOperator combiner() {
        return this.f4262;
    }

    @Override // l.InterfaceC5754
    public final Function finisher() {
        return this.f4265;
    }

    @Override // l.InterfaceC5754
    public final Supplier supplier() {
        return this.f4263;
    }
}
