package l;

import android.content.Intent;
import android.os.Bundle;
import java.io.PrintStream;

/* JADX INFO: renamed from: l.ᩳۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQG */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC17984 extends ActivityC3330 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57515 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f57516 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f57517 = -1;

    @Override // l.ActivityC3330, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f57517 = intent.getIntExtra("sessionID", -1);
        try {
            startActivityForResult((Intent) intent.getParcelableExtra("confirmationIntent"), 322);
        } catch (Exception e) {
            C8107.m21326(this.f57517, 3, e.getMessage());
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PrintStream printStream = System.out;
        StringBuilder sbM2791 = C0589.m2791("onActivityResult ", i, " ", " ", i2);
        sbM2791.append(intent);
        printStream.println(sbM2791.toString());
        if (i == 322) {
            this.f57516 = true;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f57516) {
            return;
        }
        System.out.println("Installation canceled");
        C8107.m21326(this.f57517, 2, null);
    }
}
