package l;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۜܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U998 */
/* JADX INFO: loaded from: classes4.dex */
public class C7207 extends AbstractC11813 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f23783 = new HashMap();

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23784 = 0;

    static {
        m19790(R.color.MT_Protector, R.style.MT_Protector, "default");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "black");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "purple");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "blue");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "dodger_blue");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "royal_blue");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "dark_salmon");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "orange");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "pink");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "green");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "deep_green");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "teal");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "light_gray");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "light_blue");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "light_salmon");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "monet1");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "monet2");
        m19790(R.color.MT_Protector, R.style.MT_Protector, "monet3");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19790(int i, int i2, String str) {
        f23783.put(str, new C8698(str, i, i2));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C8698 m19792(String str) {
        if (str == null) {
            str = "default";
        }
        if (str.startsWith("monet") && Build.VERSION.SDK_INT < 31) {
            str = "default";
        }
        HashMap map = f23783;
        C8698 c8698 = (C8698) map.get(str);
        if (c8698 != null) {
            return c8698;
        }
        C8698 c8699 = (C8698) map.get("default");
        C17359.requireNonNull(c8699);
        return c8699;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static int m19791() {
        return m19792(ApplicationC17729.f58262.getString("theme", "default")).f28356;
    }

    public C7207(Context context) {
        super(context);
    }

    public C7207(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C7207(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C7207(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(final AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        int i = 18;
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        if (Build.VERSION.SDK_INT < 31) {
            viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
            viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
            i = 15;
        }
        C13918[] c13918Arr = new C13918[i];
        for (int i2 = 0; i2 < i; i2++) {
            c13918Arr[i2] = (C13918) viewM40395.findViewById(iArr[i2]);
        }
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۖܳۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = C7207.f23784;
                C13918 c13918 = (C13918) view;
                if (!C7207.m19792(ApplicationC17729.f58262.getString("theme", "default")).f28357.equals(c13918.m33897())) {
                    ApplicationC17729.f58262.edit().putString("theme", c13918.m33897()).apply();
                    C14116.m34268(abstractActivityC17204);
                    this.f9087.m12566((Serializable) c13918.m33897());
                }
                dialogInterfaceC8327M8016.dismiss();
            }
        };
        C8698 c8698M19792 = m19792(ApplicationC17729.f58262.getString("theme", "default"));
        for (int i3 = 0; i3 < i; i3++) {
            C13918 c13918 = c13918Arr[i3];
            c13918.m33896(c13918.m33897().equals(c8698M19792.f28357));
            c13918.setOnClickListener(onClickListener);
        }
    }
}
