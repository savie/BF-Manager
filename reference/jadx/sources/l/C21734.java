package l;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21734 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20323 f70444;

    public C21734(C20323 c20323) {
        this.f70444 = c20323;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f70444.m45872();
        return true;
    }
}
