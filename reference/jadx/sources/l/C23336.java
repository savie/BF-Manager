package l;

import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23336 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75618;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4760 f75619;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f75620;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC22400 f75621;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f75622;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23336(C4760 c4760, Main main, boolean z, CheckBox checkBox, ViewGroup viewGroup, String str, RunnableC22400 runnableC22400) {
        super(main, R.string.MT_Protector);
        this.f75619 = c4760;
        this.f75620 = z;
        this.f75622 = checkBox;
        this.f75618 = str;
        this.f75621 = runnableC22400;
        if (z) {
            if (!c4760.f16767) {
                checkBox.setVisibility(8);
            }
            Main mainM28824 = c4760.f16771.m28824();
            CheckBox checkBox2 = (CheckBox) mainM28824.m30995(R.layout.MT_Protector);
            viewGroup.addView(checkBox2);
            C11005.m27757(mainM28824, checkBox2, str);
        }
        if (c4760.f16767 || z) {
            FrameLayout frameLayoutM40333 = m40333();
            frameLayoutM40333.setVisibility(0);
            frameLayoutM40333.addView(viewGroup);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        C4760 c4760 = this.f75619;
        String strTrim = m40352().trim();
        if (strTrim.isEmpty()) {
            m40364();
            return;
        }
        final long jM14743 = C5319.m14743(strTrim);
        if (jM14743 < 0) {
            m40365(R.string.MT_Protector);
            return;
        }
        try {
            C2462.m7542(c4760.f16770, EnumC11636.MODIFY_FILE);
            final boolean z = c4760.f16767 && this.f75622.isChecked();
            if (c4760.f16766 || z || jM14743 != ((C5696) c4760.f16769.get(0)).getTime()) {
                boolean z2 = this.f75620;
                final RunnableC22400 runnableC22400 = this.f75621;
                if (z2) {
                    C11005.m27761(new InterfaceC17354() { // from class: l.ۧ֡֨
                        @Override // l.InterfaceC17354
                        public final /* synthetic */ void onCanceled() {
                        }

                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ boolean mo6537(Exception exc) {
                            return false;
                        }

                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo6536(C14558 c14558, boolean z3) {
                            C4760.m13220(this.f36302.f75619, runnableC22400, jM14743, z, c14558, z3);
                        }
                    }, c4760.f16771.m28824(), this.f75618);
                } else {
                    C4760.m13220(c4760, runnableC22400, jM14743, z, null, false);
                }
            }
            m40364();
        } catch (C4987 e) {
            c4760.f16771.m28824().m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
