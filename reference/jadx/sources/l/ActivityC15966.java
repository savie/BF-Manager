package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J8WQ */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC15966 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51729 = 0;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "TutorialMarkdownActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC18579(3, this));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("title");
        byte[] byteArrayExtra = intent.getByteArrayExtra("markdown");
        if (stringExtra == null || byteArrayExtra == null) {
            finish();
            return;
        }
        try {
            String strM41962 = C18019.m41962(byteArrayExtra);
            setTitle(stringExtra);
            C0091.m1034((Context) this, false).mo20653((TextView) m31016(R.id.textView), strM41962);
        } catch (RuntimeException unused) {
            finish();
        }
    }
}
