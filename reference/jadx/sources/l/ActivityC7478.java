package l;

import android.content.Intent;
import android.os.Bundle;
import java.io.PrintStream;

/* JADX INFO: renamed from: l.ۜ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQG */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC7478 extends ActivityC8896 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24749 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f24750 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24751 = -1;

    @Override // l.ActivityC8896, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f24751 = intent.getIntExtra("sessionID", -1);
        try {
            startActivityForResult((Intent) intent.getParcelableExtra("confirmationIntent"), 322);
        } catch (Exception e) {
            C4650.m14505(this.f24751, 3, e.getMessage());
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PrintStream printStream = System.out;
        StringBuilder sbM5126 = C1402.m5126("onActivityResult ", i, " ", " ", i2);
        sbM5126.append(intent);
        printStream.println(sbM5126.toString());
        if (i == 322) {
            this.f24750 = true;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f24750) {
            return;
        }
        System.out.println("Installation canceled");
        C4650.m14505(this.f24751, 2, null);
    }
}
