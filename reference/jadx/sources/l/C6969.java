package l;

import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6969 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f23001;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22828 f23002;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23003;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f23004;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1945 f23005;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6969(C22828 c22828, Main main, boolean z, CheckBox checkBox, ViewGroup viewGroup, String str, RunnableC1945 runnableC1945) {
        super(main, R.string.MT_Protector);
        this.f23002 = c22828;
        this.f23004 = z;
        this.f23001 = checkBox;
        this.f23003 = str;
        this.f23005 = runnableC1945;
        if (z) {
            if (!c22828.f73983) {
                checkBox.setVisibility(8);
            }
            Main mainM23233 = c22828.f73985.m23233();
            CheckBox checkBox2 = (CheckBox) mainM23233.m40395(R.layout.MT_Protector);
            viewGroup.addView(checkBox2);
            C0938.m3746(mainM23233, checkBox2, str);
        }
        if (c22828.f73983 || z) {
            FrameLayout frameLayoutM22941 = m22941();
            frameLayoutM22941.setVisibility(0);
            frameLayoutM22941.addView(viewGroup);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        C22828 c22828 = this.f23002;
        String strTrim = m22914().trim();
        if (strTrim.isEmpty()) {
            m22951();
            return;
        }
        final long jM50717 = C22482.m50717(strTrim);
        if (jM50717 < 0) {
            m22952(R.string.MT_Protector);
            return;
        }
        try {
            C6265.m17913(c22828.f73987, EnumC12230.MODIFY_FILE);
            final boolean z = c22828.f73983 && this.f23001.isChecked();
            if (c22828.f73988 || z || jM50717 != ((C2494) c22828.f73984.get(0)).getTime()) {
                boolean z2 = this.f23004;
                final RunnableC1945 runnableC1945 = this.f23005;
                if (z2) {
                    C0938.m3749(new InterfaceC18837() { // from class: l.۠ۜ۫
                        @Override // l.InterfaceC18837
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ void mo1268() {
                        }

                        @Override // l.InterfaceC18837
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ boolean mo1270(Exception exc) {
                            return false;
                        }

                        @Override // l.InterfaceC18837
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1269(C9651 c9651, boolean z3) {
                            C22828.m51474(this.f27719.f23002, runnableC1945, jM50717, z, c9651, z3);
                        }
                    }, c22828.f73985.m23233(), this.f23003);
                } else {
                    C22828.m51474(c22828, runnableC1945, jM50717, z, null, false);
                }
            }
            m22951();
        } catch (C4866 e) {
            c22828.f73985.m23233().m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
