package l;

import android.widget.TextView;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21098 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f67387;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2343 f67388;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f67389;

    public /* synthetic */ C21098(Runnable runnable, TextView textView, C2343 c2343) {
        this.f67387 = runnable;
        this.f67389 = textView;
        this.f67388 = c2343;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f67387.run();
        this.f67389.setText("/" + this.f67388.m7891((String) obj));
    }
}
