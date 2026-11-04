package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IY */
/* JADX INFO: loaded from: classes5.dex */
public final class C16796 implements Consumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final RunnableC25002 f54188;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Consumer f54189;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6356 f54190;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f54191;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Runnable, l.᩻ۧܳ] */
    public C16796(C6356 c6356, Consumer consumer) {
        this.f54190 = c6356;
        ?? r0 = new Runnable() { // from class: l.᩻ۧܳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f80942.accept(Boolean.FALSE);
            }
        };
        this.f54188 = r0;
        this.f54189 = consumer;
        c6356.f21487.postDelayed(r0, 10000L);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void accept(Boolean bool) {
        if (this.f54191) {
            return;
        }
        this.f54191 = true;
        this.f54190.f21487.removeCallbacks(this.f54188);
        this.f54189.accept(bool);
    }
}
