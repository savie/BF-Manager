package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6IS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21178 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC1744 f67618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinearLayout f67619;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f67620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f67621 = new StringBuilder();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f67622;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9044 f67623;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f67624;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ScrollView f67625;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f67626;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Context f67627;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f67628;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C23653 f67629;

    public C21178(C9370 c9370, String str, String str2, long j, long j2, C9044 c9044, RunnableC1744 runnableC1744) {
        this.f67620 = str;
        this.f67622 = str2;
        this.f67626 = j;
        this.f67624 = j2;
        this.f67623 = c9044;
        this.f67618 = runnableC1744;
        m48318(c9370);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m48318(C9370 c9370) {
        int i = (c9370.getResources().getConfiguration().uiMode & 48) == 32 ? 2 : 1;
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(c9370);
        this.f67627 = c2361.m8020();
        LinearLayout linearLayout = new LinearLayout(this.f67627);
        this.f67619 = linearLayout;
        linearLayout.setOrientation(1);
        int iM19160 = C6907.m19160(24.0f);
        this.f67619.setPadding(iM19160, C6907.m19160(8.0f), iM19160, C6907.m19160(8.0f));
        ScrollView scrollView = new ScrollView(this.f67627);
        this.f67625 = scrollView;
        scrollView.addView(this.f67619);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8005(this.f67625);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8026(R.string.MT_Protector, null);
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        this.f67628 = dialogInterfaceC8327M7999;
        dialogInterfaceC8327M7999.m22438(i);
        this.f67628.m22426(new DialogInterface.OnDismissListener() { // from class: l.᩺۠ۚ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f78177.f67618.run();
            }
        });
        if (this.f67629 != null) {
            m48317();
            return;
        }
        this.f67621.setLength(0);
        C9044 c9044 = this.f67623;
        int i3 = c9044 == null ? 0 : c9044.f29428;
        int i4 = c9044 == null ? 0 : c9044.f29431;
        if (c9044 != null && c9044.f29434 >= 5) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
        }
        m48315(c9044 == null ? null : c9044.f29430, c9044 != null ? c9044.f29436 : null, i3, i4);
        TextView textViewM48320 = m48320();
        textViewM48320.setText(R.string.MT_Protector);
        textViewM48320.setPadding(0, C6907.m19160(16.0f), 0, 0);
        this.f67619.addView(textViewM48320);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48323(C9370 c9370) {
        if (this.f67627.getResources().getConfiguration().equals(c9370.getResources().getConfiguration())) {
            return;
        }
        final int scrollY = this.f67625.getScrollY();
        this.f67628.m22426((DialogInterface.OnDismissListener) null);
        this.f67628.dismiss();
        m48318(c9370);
        m48325();
        final ScrollView scrollView = this.f67625;
        scrollView.post(new Runnable() { // from class: l.ܰ۠ۚ
            @Override // java.lang.Runnable
            public final void run() {
                scrollView.scrollTo(0, scrollY);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48325() {
        this.f67628.m22432();
        this.f67628.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۠ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21576.m49067((CharSequence) this.f13731.f67621.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48321() {
        this.f67628.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48324(C23653 c23653) {
        this.f67629 = c23653.m52888(this.f67623);
        m48317();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48322(C9044 c9044) {
        C23653 c23653M52888;
        this.f67623 = c9044;
        C23653 c23653 = this.f67629;
        if (c23653 == null || (c23653M52888 = c23653.m52888(c9044)) == this.f67629) {
            return;
        }
        this.f67629 = c23653M52888;
        m48317();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m48317() {
        int i;
        this.f67619.removeAllViews();
        this.f67621.setLength(0);
        C23653 c23653 = this.f67629;
        m48315(c23653.f76729, c23653.f76730, c23653.f76728, c23653.f76731);
        Iterator it = this.f67629.f76726.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = R.string.MT_Protector;
                break;
            }
            int i2 = ((C16193) it.next()).f52573;
            if (i2 == R.string.MT_Protector || i2 == R.string.MT_Protector) {
                i = R.string.MT_Protector;
                break;
            }
        }
        m48314(i, this.f67629.f76726);
        m48314(R.string.MT_Protector, this.f67629.f76727);
        int i3 = this.f67629.f76732;
        if (i3 != 0) {
            TextView textViewM48320 = m48320();
            textViewM48320.setText(i3);
            textViewM48320.setPadding(0, C6907.m19160(16.0f), 0, 0);
            this.f67619.addView(textViewM48320);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48315(C15294 c15294, String str, int i, int i2) {
        String str2;
        String strM9137;
        m48312(R.string.MT_Protector);
        m48313(R.string.MT_Protector, this.f67620);
        m48313(R.string.MT_Protector, this.f67622);
        m48313(R.string.MT_Protector, str);
        if (i <= 0 || i2 <= 0) {
            str2 = null;
        } else {
            str2 = i + " × " + i2;
        }
        m48313(R.string.MT_Protector, str2);
        long j = c15294 == null ? this.f67626 : c15294.f50004;
        long j2 = c15294 == null ? this.f67624 : c15294.f50005;
        if (j >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(C8311.m22393(j));
            sb.append(" (");
            strM9137 = C2764.m9137(sb, j, " B)");
        } else {
            strM9137 = null;
        }
        m48313(R.string.MT_Protector, strM9137);
        m48313(R.string.MT_Protector, j2 > 0 ? C22482.m50718(j2) : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48314(int i, List list) {
        int i2;
        if (list.isEmpty()) {
            return;
        }
        m48312(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16193 c16193 = (C16193) it.next();
            String string = c16193.f52574;
            int i3 = c16193.f52573;
            if (i3 == R.string.MT_Protector) {
                string = this.f67627.getString(string.equals("1") ? R.string.MT_Protector : R.string.MT_Protector);
            } else if (i3 == R.string.MT_Protector) {
                int i4 = Integer.parseInt(string);
                switch (i4) {
                    case 3:
                    case 4:
                        i2 = 180;
                        break;
                    case 5:
                    case 8:
                        i2 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                        break;
                    case 6:
                    case 7:
                        i2 = 90;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                String str = i2 + "°";
                if (i4 == 2 || i4 == 4 || i4 == 5 || i4 == 7) {
                    StringBuilder sbM10405 = C3188.m10405(str, " (");
                    sbM10405.append(this.f67627.getString(R.string.MT_Protector));
                    sbM10405.append(MotionUtils.EASING_TYPE_FORMAT_END);
                    string = sbM10405.toString();
                } else {
                    string = str;
                }
            }
            m48313(i3, string);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48312(int i) {
        TextView textViewM48320 = m48320();
        textViewM48320.setTypeface(textViewM48320.getTypeface(), 1);
        textViewM48320.setText(i);
        textViewM48320.setPadding(0, C6907.m19160(this.f67619.getChildCount() == 0 ? 0.0f : 16.0f), 0, C6907.m19160(6.0f));
        this.f67619.addView(textViewM48320);
        StringBuilder sb = this.f67621;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(this.f67627.getString(i));
        sb.append('\n');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48313(int i, String str) {
        if (str == null || str.isEmpty()) {
            str = this.f67627.getString(R.string.MT_Protector);
        }
        LinearLayout linearLayout = new LinearLayout(this.f67627);
        linearLayout.setOrientation(0);
        TextView textViewM48320 = m48320();
        TextView textViewM48321 = m48320();
        textViewM48320.setText(i);
        textViewM48320.setPadding(0, 0, C6907.m19160(12.0f), 0);
        ViewOnClickListenerC15284.m36687(textViewM48321, str);
        linearLayout.addView(textViewM48320, new LinearLayout.LayoutParams(0, -2, 0.38f));
        linearLayout.addView(textViewM48321, new LinearLayout.LayoutParams(0, -2, 0.62f));
        linearLayout.setPadding(0, C6907.m19160(3.0f), 0, C6907.m19160(3.0f));
        this.f67619.addView(linearLayout);
        String string = this.f67627.getString(i);
        StringBuilder sb = this.f67621;
        sb.append(string);
        sb.append(": ");
        sb.append(str);
        sb.append('\n');
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private TextView m48320() {
        return (TextView) LayoutInflater.from(this.f67627).inflate(R.layout.MT_Protector, (ViewGroup) null, false);
    }
}
