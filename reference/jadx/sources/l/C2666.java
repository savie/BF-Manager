package l;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U998 */
/* JADX INFO: loaded from: classes3.dex */
public class C2666 extends AbstractC18168 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10335 = 0;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f10336 = new HashMap();

    static {
        m8209(R.color.MT_Protector, R.style.MT_Protector, "default");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "black");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "purple");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "blue");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "dodger_blue");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "royal_blue");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "dark_salmon");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "orange");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "pink");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "green");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "deep_green");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "teal");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "light_gray");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "light_blue");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "light_salmon");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "monet1");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "monet2");
        m8209(R.color.MT_Protector, R.style.MT_Protector, "monet3");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8209(int i, int i2, String str) {
        f10336.put(str, new C11840(str, i, i2));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C11840 m8211(String str) {
        if (str == null) {
            str = "default";
        }
        if (str.startsWith("monet") && Build.VERSION.SDK_INT < 31) {
            str = "default";
        }
        HashMap map = f10336;
        C11840 c11840 = (C11840) map.get(str);
        if (c11840 != null) {
            return c11840;
        }
        C11840 c11841 = (C11840) map.get("default");
        C13638.requireNonNull(c11841);
        return c11841;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static int m8210() {
        return m8211(ApplicationC0716.f2988.getString("theme", "default")).f39742;
    }

    public C2666(Context context) {
        super(context);
    }

    public C2666(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C2666(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C2666(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(final AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        int i = 18;
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        if (Build.VERSION.SDK_INT < 31) {
            viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
            viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
            i = 15;
        }
        C5489[] c5489Arr = new C5489[i];
        for (int i2 = 0; i2 < i; i2++) {
            c5489Arr[i2] = (C5489) viewM30995.findViewById(iArr[i2]);
        }
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܰܿۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = C2666.f10335;
                C5489 c5489 = (C5489) view;
                if (!C2666.m8211(ApplicationC0716.f2988.getString("theme", "default")).f39743.equals(c5489.m15178())) {
                    ApplicationC0716.f2988.edit().putString("theme", c5489.m15178()).apply();
                    C14040.m33954(abstractActivityC12483);
                    this.f45926.m13140((Serializable) c5489.m15178());
                }
                dialogInterfaceC19356M21269.dismiss();
            }
        };
        C11840 c11840M8211 = m8211(ApplicationC0716.f2988.getString("theme", "default"));
        for (int i3 = 0; i3 < i; i3++) {
            C5489 c5489 = c5489Arr[i3];
            c5489.m15177(c5489.m15178().equals(c11840M8211.f39743));
            c5489.setOnClickListener(onClickListener);
        }
    }
}
