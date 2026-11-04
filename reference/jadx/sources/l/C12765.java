package l;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۫֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12765 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextView f40838;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextView f40839;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Button f40841;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f40844;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f40845;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView f40846;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f40847;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final TextView f40850;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f40851;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f40852;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f40854;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final View f40855;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f40857;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f40858;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f40859;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Runnable f40861;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f40837 = new AtomicInteger();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Handler f40836 = new HandlerC15002(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AtomicReference f40853 = new AtomicReference();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AtomicReference f40860 = new AtomicReference();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AtomicReference f40856 = new AtomicReference();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AtomicReference f40848 = new AtomicReference();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AtomicReference f40843 = new AtomicReference();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40840 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final WeakReference f40842 = new WeakReference(this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f40849 = f40837.incrementAndGet();

    public C12765(AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        viewM40395.setKeepScreenOn(true);
        this.f40839 = (TextView) viewM40395.findViewById(R.id.title);
        this.f40838 = (TextView) viewM40395.findViewById(R.id.value1);
        this.f40854 = (TextView) viewM40395.findViewById(R.id.value2);
        this.f40846 = (TextView) viewM40395.findViewById(R.id.value3);
        this.f40850 = (TextView) viewM40395.findViewById(R.id.value4);
        this.f40859 = (TextView) viewM40395.findViewById(R.id.value5);
        this.f40852 = (TextView) viewM40395.findViewById(R.id.header4);
        this.f40858 = viewM40395.findViewById(R.id.MT_Protector);
        this.f40855 = viewM40395.findViewById(R.id.MT_Protector);
        this.f40851 = (ProgressBar) viewM40395.findViewById(R.id.MT_Protector);
        this.f40841 = (Button) viewM40395.findViewById(R.id.MT_Protector);
        this.f40847 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f40845 = viewM40395.findViewById(R.id.MT_Protector);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8012(false);
        this.f40844 = c2361BuildDialog.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31635(Runnable runnable) {
        this.f40857 = false;
        this.f40861 = runnable;
        this.f40844.m22427(new DialogInterfaceOnKeyListenerC19478(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31630() {
        if (this.f40857) {
            return;
        }
        this.f40857 = true;
        Runnable runnable = this.f40861;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m31648() {
        return this.f40857;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m31643(CharSequence charSequence) {
        boolean zM50557 = C22415.m50557();
        AtomicReference atomicReference = this.f40853;
        if (zM50557) {
            atomicReference.set(null);
            this.f40839.setText(C10745.m27386(charSequence));
        } else {
            atomicReference.set(charSequence);
            m31642();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31646(CharSequence charSequence) {
        boolean zM50557 = C22415.m50557();
        AtomicReference atomicReference = this.f40843;
        if (zM50557) {
            atomicReference.set(null);
            this.f40847.setText(C10745.m27386(charSequence));
        } else {
            atomicReference.set(charSequence);
            m31642();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31634(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        View view = this.f40858;
        if (zIsEmpty) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.f40854.setText(C10745.m27386(charSequence));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m31641(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        View view = this.f40855;
        if (zIsEmpty) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.f40846.setText(C10745.m27386(charSequence));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31632(int i, View.OnClickListener onClickListener) {
        Button button = this.f40841;
        button.setVisibility(0);
        button.setText(i);
        button.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m31640() {
        this.f40844.m22432();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m31639(CharSequence charSequence) {
        boolean zM50557 = C22415.m50557();
        AtomicReference atomicReference = this.f40860;
        if (zM50557) {
            atomicReference.set(null);
            this.f40838.setText(C10745.m27386(charSequence));
        } else {
            atomicReference.set(charSequence);
            m31642();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31645(final int i) {
        if (C22415.m50557()) {
            this.f40852.setText(i);
        } else {
            C21576.m49068(new Runnable() { // from class: l.ۤ֨ᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33476.f40852.setText(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31626(C12765 c12765, boolean z) {
        View view = c12765.f40855;
        View view2 = c12765.f40858;
        View view3 = c12765.f40845;
        TextView textView = c12765.f40847;
        if (z) {
            textView.setVisibility(0);
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        textView.setVisibility(8);
        view3.setVisibility(0);
        view2.setVisibility(c12765.f40854.length() == 0 ? 8 : 0);
        view.setVisibility(c12765.f40846.length() == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31636(C1858 c1858) {
        String str;
        if (c1858.m6381() == 1) {
            str = c1858.m6377() + "/" + c1858.m6384();
        } else {
            str = c1858.m6382() + " (" + c1858.m6377() + "/" + c1858.m6384() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        m31647(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31647(CharSequence charSequence) {
        boolean zM50557 = C22415.m50557();
        AtomicReference atomicReference = this.f40848;
        if (zM50557) {
            atomicReference.set(null);
            this.f40850.setText(charSequence);
        } else {
            atomicReference.set(charSequence);
            m31642();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31633(long j) {
        String str = C8311.m22390(j) + "/s";
        boolean zM50557 = C22415.m50557();
        AtomicReference atomicReference = this.f40856;
        if (zM50557) {
            atomicReference.set(null);
            this.f40859.setText(str);
        } else {
            atomicReference.set(str);
            m31642();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31637(boolean z) {
        this.f40851.setIndeterminate(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31631(int i) {
        ProgressBar progressBar = this.f40851;
        if (progressBar.getProgress() != i) {
            boolean zM50557 = C22415.m50557();
            AtomicInteger atomicInteger = this.f40840;
            if (zM50557) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m31642();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31644() {
        f40836.removeMessages(this.f40849);
        if (C22415.m50557()) {
            boolean zM31628 = m31628();
            DialogInterfaceC8327 dialogInterfaceC8327 = this.f40844;
            if (zM31628) {
                C17359.requireNonNull(dialogInterfaceC8327);
                C21576.m49069(new RunnableC22205(1, dialogInterfaceC8327), 50L);
                return;
            } else {
                dialogInterfaceC8327.dismiss();
                return;
            }
        }
        C21576.m49068(new RunnableC13368(2, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31624(C12765 c12765) {
        DialogInterfaceC8327 dialogInterfaceC8327 = c12765.f40844;
        if (c12765.m31628()) {
            C17359.requireNonNull(dialogInterfaceC8327);
            C21576.m49069(new RunnableC22205(1, dialogInterfaceC8327), 50L);
        } else {
            dialogInterfaceC8327.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m31638() {
        return this.f40844;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m31642() {
        Handler handler = f40836;
        int i = this.f40849;
        if (handler.hasMessages(i)) {
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(i, this.f40842), 15L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m31628() {
        boolean z;
        CharSequence charSequence = (CharSequence) this.f40853.getAndSet(null);
        CharSequence charSequence2 = (CharSequence) this.f40860.getAndSet(null);
        CharSequence charSequence3 = (CharSequence) this.f40856.getAndSet(null);
        CharSequence charSequence4 = (CharSequence) this.f40848.getAndSet(null);
        CharSequence charSequence5 = (CharSequence) this.f40843.getAndSet(null);
        int andSet = this.f40840.getAndSet(-1);
        if (charSequence != null) {
            this.f40839.setText(C10745.m27386(charSequence));
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 != null) {
            this.f40838.setText(C10745.m27386(charSequence2));
            z = true;
        }
        if (charSequence3 != null) {
            this.f40859.setText(charSequence3);
            z = true;
        }
        if (charSequence4 != null) {
            this.f40850.setText(charSequence4);
            z = true;
        }
        if (charSequence5 != null) {
            this.f40847.setText(C10745.m27386(charSequence5));
            z = true;
        }
        if (andSet == -1) {
            return z;
        }
        this.f40851.setProgress(andSet);
        return true;
    }
}
