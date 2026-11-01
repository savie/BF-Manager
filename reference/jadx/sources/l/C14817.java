package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import bin.mt.json.JSON;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.ܳ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D77Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14817 implements InterfaceC18848, InterfaceC17722, InterfaceC11974 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f48431;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f48432;

    public /* synthetic */ C14817(Object obj, Object obj2) {
        this.f48431 = obj;
        this.f48432 = obj2;
    }

    @Override // l.InterfaceC17722
    /* JADX INFO: renamed from: ۙ */
    public C17669 mo7418(int i) {
        return C2115.m6661((C2115) this.f48431, (C6784) this.f48432, i);
    }

    @Override // l.InterfaceC11974
    /* JADX INFO: renamed from: ۙ */
    public C12731 mo15512(String str, String str2, String str3) {
        return C12731.m31631(str, str2, "fatal", null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, (String) this.f48431, "policyRevision", (String) this.f48432).add("operation", "check_parent_links").add("backendReason", str3).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(final AbstractC20745 abstractC20745) {
        boolean z;
        C11545 c11545 = (C11545) this.f48431;
        final InterfaceC2557 interfaceC2557 = (InterfaceC2557) this.f48432;
        final Main mainM28824 = c11545.m28824();
        int i = ActivityC11220.f37969;
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC20745.mo33970());
            try {
                z = ((long) dataInputStream.readInt()) == 2135247942;
                try {
                    dataInputStream.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused2) {
            z = false;
        }
        String strM39288 = C16737.m39288(R.string.MT_Protector);
        SpannableString spannableString = new SpannableString(((Object) strM39288) + "\n" + C16737.m39288(R.string.MT_Protector));
        spannableString.setSpan(new ForegroundColorSpan(C20368.f65966), strM39288.length() + 1, spannableString.length(), 17);
        spannableString.setSpan(new AbsoluteSizeSpan(C13932.m33770(12.0f)), strM39288.length() + 1, spannableString.length(), 17);
        C8067 c8067BuildDialog = mainM28824.buildDialog();
        c8067BuildDialog.m21277(abstractC20745.getName());
        c8067BuildDialog.m21261(ApplicationC0716.f2992.getBoolean("ewrp", false) ? spannableString : strM39288);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶᩶ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = ActivityC11220.f37969;
                int i4 = C8265.f28733;
                AbstractActivityC12483 abstractActivityC12483 = mainM28824;
                Intent intent = new Intent(abstractActivityC12483, (Class<?>) ActivityC11220.class);
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(abstractC20745.m46732());
                abstractActivityC12483.startActivity(intent);
                C6936.m18602(interfaceC2557, 2000);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵᩶ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = ActivityC11220.f37969;
                int i4 = C8265.f28733;
                AbstractActivityC12483 abstractActivityC12483 = mainM28824;
                Intent intent = new Intent(abstractActivityC12483, (Class<?>) ActivityC11632.class);
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(abstractC20745.m46732());
                abstractActivityC12483.startActivity(intent);
                C6936.m18602(interfaceC2557, 2000);
            }
        });
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        if (z) {
            dialogInterfaceC19356M21269.m44374().setEnabled(false);
        }
        C23250.m51307(dialogInterfaceC19356M21269);
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new ViewOnClickListenerC19974(dialogInterfaceC19356M21269, spannableString, strM39288, 2));
    }
}
