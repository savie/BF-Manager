package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bin.mt.plus.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes4.dex */
public final class C11944 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6527 f40058;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f40059;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15472 f40060;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f40061 = false;

    public C11944(ActivityC15472 activityC15472) {
        this.f40060 = activityC15472;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10252(this.f40060, 100);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        C6527 c6527;
        ActivityC15472 activityC15472 = this.f40060;
        AbstractC20745 abstractC20745 = activityC15472.f50407;
        if (abstractC20745.mo33964() > 20971520) {
            throw new IOException("File too large");
        }
        byte[] bArrM46727 = abstractC20745.m46727();
        try {
            c6527 = new C6527(bArrM46727);
        } catch (IOException e) {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM46727, 0, bArrM46727.length);
            if (bitmapDecodeByteArray == null) {
                throw e;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            c6527 = new C6527(byteArrayOutputStream.toByteArray());
        }
        this.f40058 = c6527;
        if (c6527.m17740()) {
            activityC15472.f50414 = true;
        } else if (activityC15472.f50413.toLowerCase().endsWith(".9.png") && this.f40058.m17736()) {
            activityC15472.f50414 = false;
        } else {
            activityC15472.f50414 = false;
            this.f40061 = true;
        }
        AbstractC20745 abstractC20745M46728 = C11904.f39939.m46728();
        this.f40059 = abstractC20745M46728;
        abstractC20745M46728.m46703(this.f40058.m17739());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        boolean z = this.f40061;
        ActivityC15472 activityC15472 = this.f40060;
        if (!z) {
            activityC15472.f50419.m23926(this.f40058);
            activityC15472.m37007(this.f40058);
            activityC15472.f50412 = this.f40059;
            return;
        }
        C8067 c8067BuildDialog = activityC15472.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5572(1, this));
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰ᩷ۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f46203.f40060.finish();
            }
        });
        c8067BuildDialog.m21265(false);
        c8067BuildDialog.m21269();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f40060.m31003((Throwable) exc, true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
