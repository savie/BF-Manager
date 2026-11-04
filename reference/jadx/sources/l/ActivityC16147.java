package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J8WQ */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16147 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52436 = 0;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "TutorialMarkdownActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC16971(5, this));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("title");
        byte[] byteArrayExtra = intent.getByteArrayExtra("markdown");
        if (stringExtra == null || byteArrayExtra == null) {
            finish();
            return;
        }
        try {
            String strM37700 = C15768.m37700(byteArrayExtra);
            setTitle(stringExtra);
            C23302.m52413((Context) this, false).mo3052((TextView) m40418(R.id.textView), strM37700);
        } catch (RuntimeException unused) {
            finish();
        }
    }
}
