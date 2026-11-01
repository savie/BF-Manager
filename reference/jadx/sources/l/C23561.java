package l;

import android.os.Looper;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes.dex */
public final class C23561 extends AbstractViewOnClickListenerC6314 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static WeakReference f76287;

    /* JADX WARN: Illegal instructions before constructor call */
    public C23561(Main main, C12665 c12665) {
        String strM39288 = C16737.m39288(R.string.MT_Protector);
        super(main, strM39288, strM39288, c12665);
        f76287 = new WeakReference(this);
        m51926();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m51925() {
        C23561 c23561;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C16737.m39273(new RunnableC8666(1));
            return;
        }
        WeakReference weakReference = f76287;
        if (weakReference == null || (c23561 = (C23561) weakReference.get()) == null) {
            return;
        }
        c23561.m51926();
        c23561.f21343.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m51926() {
        ArrayList arrayList = this.f21338;
        arrayList.clear();
        Main main = this.f47137;
        if (main.m125() != null) {
            C14638 c14638M18621 = main.m125().m18621();
            c14638M18621.m35141();
            try {
                Iterator<E> it = c14638M18621.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C17210(this, main, (AbstractC11462) it.next()));
                }
                c14638M18621.m35142();
            } catch (Throwable th) {
                c14638M18621.m35142();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m51922() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m51925();
        } else {
            m51926();
            this.f21343.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractViewOnClickListenerC6314
    /* JADX INFO: renamed from: ۙ */
    public final void mo15483(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543, int i) {
        C5921 c5921 = (C5921) abstractViewOnLongClickListenerC22543;
        C17210 c17210 = (C17210) this.f21338.get(i);
        c5921.f20181 = c17210;
        c5921.f73517.setText(c17210.f54856);
        c5921.f73514.setText(c17210.f54855);
        c5921.f73512.m27921(c17210.f54852);
        c5921.itemView.setOnClickListener(c17210);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51924(C23561 c23561, C5921 c5921) {
        C12665 c12665 = c23561.f21343;
        ArrayList arrayList = c23561.f21338;
        C17210 c17210 = c5921.f20181;
        C6936 c6936M125 = c23561.f47137.m125();
        if (c17210 == null || c6936M125 == null) {
            c23561.m51922();
            return;
        }
        int iMo27216 = c17210.mo27216();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            View.OnClickListener onClickListener = (AbstractViewOnClickListenerC10549) arrayList.get(i);
            if ((onClickListener instanceof InterfaceC10861) && ((InterfaceC10861) onClickListener).mo27216() == iMo27216) {
                break;
            } else {
                i++;
            }
        }
        int bindingAdapterPosition = c5921.getBindingAdapterPosition();
        int iM31486 = c12665.m31486(c23561);
        if (i != -1 && bindingAdapterPosition != -1 && iM31486 != -1 && bindingAdapterPosition == iM31486 + 1 + i) {
            z = true;
        }
        if (c6936M125.m18636(iMo27216) && z && i >= 0 && i < arrayList.size()) {
            Object obj = arrayList.get(i);
            if ((obj instanceof InterfaceC10861) && ((InterfaceC10861) obj).mo27216() == iMo27216) {
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c12665.notifyItemRangeRemoved(bindingAdapterPosition - 1, 2);
                    return;
                } else {
                    c12665.notifyItemRangeRemoved(bindingAdapterPosition, 1);
                    return;
                }
            }
        }
        c23561.m51922();
    }
}
