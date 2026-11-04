package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bin.mt.plus.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes4.dex */
public final class C10630 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f33714;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16597 f33715;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15425 f33716;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f33717 = false;

    public C10630(ActivityC16597 activityC16597) {
        this.f33715 = activityC16597;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8199(this.f33715, 100);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        C15425 c15425;
        ActivityC16597 activityC16597 = this.f33715;
        AbstractC22044 abstractC22044 = activityC16597.f53685;
        if (abstractC22044.mo4285() > 20971520) {
            throw new IOException("File too large");
        }
        byte[] bArrM49865 = abstractC22044.m49865();
        try {
            c15425 = new C15425(bArrM49865);
        } catch (IOException e) {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM49865, 0, bArrM49865.length);
            if (bitmapDecodeByteArray == null) {
                throw e;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            c15425 = new C15425(byteArrayOutputStream.toByteArray());
        }
        this.f33716 = c15425;
        if (c15425.m36952()) {
            activityC16597.f53688 = true;
        } else if (activityC16597.f53683.toLowerCase().endsWith(".9.png") && this.f33716.m36950()) {
            activityC16597.f53688 = false;
        } else {
            activityC16597.f53688 = false;
            this.f33717 = true;
        }
        AbstractC22044 abstractC22044M49877 = C6382.f21565.m49877();
        this.f33714 = abstractC22044M49877;
        abstractC22044M49877.m49849(this.f33716.m36954());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        boolean z = this.f33717;
        ActivityC16597 activityC16597 = this.f33715;
        if (!z) {
            activityC16597.f53686.m4741(this.f33716);
            activityC16597.m39264(this.f33716);
            activityC16597.f53682 = this.f33714;
            return;
        }
        C2361 c2361BuildDialog = activityC16597.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙۙۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C10630 c10630 = this.f16473;
                ActivityC16597 activityC16598 = c10630.f33715;
                try {
                    activityC16598.f53686.m4741(c10630.f33716);
                    activityC16598.f53686.m4743(true);
                    activityC16598.f53686.m4743(false);
                    activityC16598.f53686.m4755();
                    String strM49874 = activityC16598.f53685.m49874();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strM49874);
                    sb.append(strM49874.endsWith(".9") ? ".png" : ".9.png");
                    activityC16598.f53683 = sb.toString();
                    activityC16598.f53685 = null;
                    activityC16598.m39264(c10630.f33716);
                    activityC16598.f53682 = c10630.f33714;
                } catch (Exception e) {
                    activityC16598.m40402((Throwable) e, true);
                }
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ۙۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f69559.f33715.finish();
            }
        });
        c2361BuildDialog.m8012(false);
        c2361BuildDialog.m8016();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f33715.m40402((Throwable) exc, true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
