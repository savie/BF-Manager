package l;

import android.os.Looper;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8287 extends AbstractViewOnClickListenerC8526 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static WeakReference f27246;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8287(Main main, C9271 c9271) {
        String strM49088 = C21576.m49088(R.string.MT_Protector);
        super(main, strM49088, strM49088, c9271);
        f27246 = new WeakReference(this);
        m22381();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m22382() {
        C8287 c8287;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C21576.m49068(new RunnableC23613(1));
            return;
        }
        WeakReference weakReference = f27246;
        if (weakReference == null || (c8287 = (C8287) weakReference.get()) == null) {
            return;
        }
        c8287.m22381();
        c8287.f27860.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m22381() {
        ArrayList arrayList = this.f27858;
        arrayList.clear();
        Main main = this.f22654;
        if (main.m117() != null) {
            C2935 c2935M46163 = main.m117().m46163();
            c2935M46163.m9583();
            try {
                Iterator<E> it = c2935M46163.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0829(this, main, (AbstractC7364) it.next()));
                }
                c2935M46163.m9584();
            } catch (Throwable th) {
                c2935M46163.m9584();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m22380() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m22382();
        } else {
            m22381();
            this.f27860.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractViewOnClickListenerC8526
    /* JADX INFO: renamed from: ۙ */
    public final void mo3565(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544, int i) {
        C9032 c9032 = (C9032) abstractViewOnLongClickListenerC5544;
        C0829 c0829 = (C0829) this.f27858.get(i);
        c9032.f29392 = c0829;
        c9032.f19266.setText(c0829.f3125);
        c9032.f19262.setText(c0829.f3121);
        c9032.f19265.m9864(c0829.f3124);
        c9032.itemView.setOnClickListener(c0829);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22379(C8287 c8287, C9032 c9032) {
        C9271 c9271 = c8287.f27860;
        ArrayList arrayList = c8287.f27858;
        C0829 c0829 = c9032.f29392;
        C20065 c20065M117 = c8287.f22654.m117();
        if (c0829 == null || c20065M117 == null) {
            c8287.m22380();
            return;
        }
        int iMo3321 = c0829.mo3321();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            View.OnClickListener onClickListener = (AbstractViewOnClickListenerC21206) arrayList.get(i);
            if ((onClickListener instanceof InterfaceC2321) && ((InterfaceC2321) onClickListener).mo3321() == iMo3321) {
                break;
            } else {
                i++;
            }
        }
        int bindingAdapterPosition = c9032.getBindingAdapterPosition();
        int iM24474 = c9271.m24474(c8287);
        if (i != -1 && bindingAdapterPosition != -1 && iM24474 != -1 && bindingAdapterPosition == iM24474 + 1 + i) {
            z = true;
        }
        if (c20065M117.m46154(iMo3321) && z && i >= 0 && i < arrayList.size()) {
            Object obj = arrayList.get(i);
            if ((obj instanceof InterfaceC2321) && ((InterfaceC2321) obj).mo3321() == iMo3321) {
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c9271.notifyItemRangeRemoved(bindingAdapterPosition - 1, 2);
                    return;
                } else {
                    c9271.notifyItemRangeRemoved(bindingAdapterPosition, 1);
                    return;
                }
            }
        }
        c8287.m22380();
    }
}
