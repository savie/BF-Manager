package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67CI */
/* JADX INFO: loaded from: classes5.dex */
public final class C14492 extends AbstractC13001 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10567 f45607;

    public C14492(Main main, C9271 c9271, C10567 c10567) {
        super(main, c10567.f33581, "drawer_expand_network_group_" + c10567.f33580, c9271, c10567.f33580);
        this.f45607 = c10567;
    }

    @Override // l.AbstractViewOnClickListenerC8526
    /* JADX INFO: renamed from: ۙ */
    public final void mo22839(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544) {
        super.mo22839(abstractViewOnLongClickListenerC5544);
        if (this.f27860.m24482()) {
            ((C2560) abstractViewOnLongClickListenerC5544).f19266.setText(this.f27857 + " (" + C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
    }

    @Override // l.AbstractViewOnClickListenerC8526
    /* JADX INFO: renamed from: ۤ */
    public final int mo13033() {
        if (this.f27855) {
            return this.f27858.size() + 1;
        }
        return 1;
    }

    @Override // l.AbstractViewOnClickListenerC8526, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f27860.m24482()) {
            return false;
        }
        C18452 c18452 = new C18452(this.f22654, view, 8388693);
        C10378.m26694(view);
        c18452.m42997();
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42994(new C11398(5, this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35004(C14492 c14492, MenuItem menuItem) {
        C10567 c10567 = c14492.f45607;
        Main main = c14492.f22654;
        int itemId = menuItem.getItemId();
        int i = 1;
        if (itemId == R.string.MT_Protector) {
            C21952 c21952 = new C21952(main, c10567);
            c21952.m22945(R.string.MT_Protector);
            c21952.m22924((CharSequence) c10567.f33581);
            c21952.m22918();
            c21952.m22959();
            c21952.m22955(true);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C2361 c2361BuildDialog = main.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(main.getString(R.string.MT_Protector, c10567.f33581));
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC17166(i, c14492));
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                AbstractC13001.m32417(main);
                return;
            }
            return;
        }
        C25227 c25227 = (C25227) main.m40395(R.layout.MT_Protector);
        final ArrayList arrayListM45054 = C19518.m45054();
        C5348 c5348 = new C5348(main, arrayListM45054);
        C0385.m2188(c25227, -1, C6907.m19160(6.0f), -1, -1);
        c25227.setAdapter(c5348);
        C11999 c11999 = new C11999(new C12805(arrayListM45054, c5348));
        c11999.m30173(c25227);
        c5348.m16001(c11999);
        C2361 c2361BuildDialog2 = main.buildDialog();
        c2361BuildDialog2.m8021(R.string.MT_Protector);
        c2361BuildDialog2.m8005(c25227);
        c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳۖܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ArrayList arrayList = arrayListM45054;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C10567) it.next()).f33580));
                }
                C19518.m45046(arrayList2);
            }
        });
        c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog2.m8016();
    }
}
