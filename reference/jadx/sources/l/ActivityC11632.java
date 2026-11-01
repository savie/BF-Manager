package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۨۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11632 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39058 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C17381 f39061;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C10886 f39062;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public boolean f39065;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public boolean f39066;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f39067;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public C17485 f39069;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C6938 f39070;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public C6382 f39072;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public C4647 f39073;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public C7606 f39074;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public C17492 f39075;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public C0652 f39076;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public C11546 f39077;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public boolean f39078;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public static final Object f39060 = new Object();

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public static final Object f39059 = new Object();

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public C4496 f39071 = new C4496(this, 1);

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f39080 = new ArrayList();

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f39064 = -1;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f39079 = false;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C22959 f39063 = C22959.m50801();

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public boolean f39068 = false;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "TextEditor";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28985(ActivityC11632 activityC11632, int i, CheckBox checkBox) {
        activityC11632.getClass();
        ArrayList arrayList = activityC11632.f39080;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C23520.m51799(arrayList2, new C21468());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C9475(activityC11632, linkedList, (C20409) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC11632.f39079 = true;
        ((C9475) linkedList.removeFirst()).m24288();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28995(ActivityC11632 activityC11632, int i, CheckBox checkBox) {
        activityC11632.getClass();
        ArrayList arrayList = new ArrayList(activityC11632.f39080);
        arrayList.remove(i);
        C23520.m51799(arrayList, new C21468());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C9475(activityC11632, linkedList, (C20409) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC11632.f39079 = true;
        ((C9475) linkedList.removeFirst()).m24288();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29002(ActivityC11632 activityC11632, int i, CheckBox checkBox) {
        activityC11632.getClass();
        ArrayList arrayList = new ArrayList(activityC11632.f39080.subList(0, i));
        C23520.m51799(arrayList, new C21468());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C9475(activityC11632, linkedList, (C20409) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC11632.f39079 = true;
        ((C9475) linkedList.removeFirst()).m24288();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte[] bArrM46727;
        int iM28996;
        super.onCreate(bundle);
        setTitle("");
        m31016(R.layout.MT_Protector);
        m31023();
        m31021().m16257(2);
        m28976();
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C20058 c20058 = new C20058(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c20058);
        m31016(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۡۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC11632.f39058;
                this.f60458.m29017(false);
            }
        });
        C6938 c6939 = (C6938) m31016(R.id.MT_Protector);
        this.f39070 = c6939;
        c6939.setTitle(R.string.MT_Protector);
        this.f39070.inflateMenu(R.menu.MT_Protector);
        this.f39077 = new C11546(this.f39070, R.id.MT_Protector, R.id.more);
        this.f39070.setOnMenuItemClickListener(new C8063(this));
        this.f39061 = (C17381) m31016(R.id.MT_Protector);
        this.f39067 = (FloatingActionButton) m31016(R.id.MT_Protector);
        m31006(this.f39061, m31016(R.id.MT_Protector), this.f41645, m31016(R.id.MT_Protector), this.f39070, this.f39067);
        this.f39061.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩵ۡۖ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC11632.m28983(this.f62393);
            }
        });
        C2934 c2934 = new C2934(this, this.f39061, this.f41645);
        c2934.m8752().m22295(C20368.f65968.getDefaultColor());
        this.f39061.m40481(c2934);
        c2934.m8754();
        this.f39061.m40481(new C15825(this));
        C0652 c0652 = (C0652) new C16717(this).m39205(C0652.class);
        this.f39076 = c0652;
        c0652.m2970(this, this.f39071);
        this.f39072 = (C6382) new C16717(this).m39205(C6382.class);
        this.f39074 = new C7606();
        C16737.m39274(new RunnableC8769(0, this), 500L);
        boolean z = bundle != null;
        synchronized (f39060) {
            AbstractC20745 abstractC20745M7344 = C2417.m7344();
            if (abstractC20745M7344.mo33975()) {
                try {
                    bArrM46727 = abstractC20745M7344.m46727();
                } catch (Exception e) {
                    this.f39076.m2969((Throwable) e);
                    bArrM46727 = null;
                }
                if (bArrM46727 != null) {
                    try {
                        C17367 c17367 = new C17367(bArrM46727);
                        C20190.m45649((InterfaceC0433) c17367, 1736577895);
                        while (c17367.available() > 0) {
                            byte[] bArrM40451 = c17367.m40451();
                            C20409 c20409 = new C20409();
                            if (c20409.getArguments() != null) {
                                throw new RuntimeException("Arguments is not null.");
                            }
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.unmarshall(bArrM40451, 0, bArrM40451.length);
                            parcelObtain.setDataPosition(0);
                            Bundle bundle2 = new Bundle();
                            bundle2.readFromParcel(parcelObtain);
                            c20409.setArguments(bundle2);
                            parcelObtain.recycle();
                            ComponentCallbacksC22654 componentCallbacksC22654M23119 = m43943().m23119(c20409.m13348());
                            if (!z) {
                                C6171.m17178(componentCallbacksC22654M23119);
                                c20409.m13354();
                                if (c20409.m13351()) {
                                    this.f39080.add(c20409);
                                }
                            } else if (componentCallbacksC22654M23119 != null) {
                                C20409 c204010 = (C20409) componentCallbacksC22654M23119;
                                if (!c204010.m13351()) {
                                    try {
                                        c204010.m13354();
                                    } catch (Exception e2) {
                                        this.f39076.m2969((Throwable) e2);
                                    }
                                }
                                if (c204010.m13351()) {
                                    this.f39080.add(c204010);
                                }
                            } else {
                                c20409.m13354();
                                if (c20409.m13351()) {
                                    this.f39080.add(c20409);
                                }
                            }
                            this.f39076.m2969((Throwable) e);
                        }
                    } catch (Exception e3) {
                        this.f39076.m2969((Throwable) e3);
                    }
                }
                C0652 c0653 = this.f39076;
                if (c0653.f2766) {
                    c0653.f2766 = false;
                    List listMo33983 = C2417.m7342().mo33983(true);
                    final ArrayList arrayList = new ArrayList();
                    arrayList.add(C14690.m35219("current|list").matcher((CharSequence) ""));
                    for (int i = 0; i < this.f39080.size(); i++) {
                        arrayList.add(C14690.m35219(C17874.m41459(((C20409) this.f39080.get(i)).m13348()) + "((-\\d+)?\\.dat|\\.tat|\\.lit|\\.e2)").matcher((CharSequence) ""));
                    }
                    C9030.stream(listMo33983).filter(new Predicate() { // from class: l.᩷ۡۖ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C8512.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo9645negate() {
                            return C8512.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C8512.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i2 = ActivityC11632.f39058;
                            String name = ((AbstractC20745) obj).getName();
                            for (C6222 c6222 : arrayList) {
                                c6222.m17276reset((CharSequence) name);
                                if (c6222.matches()) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }).forEach(new C0965(1));
                }
            }
        }
        this.f39062 = new C10886(this);
        C17492 c17492 = (C17492) findViewById(R.id.MT_Protector);
        this.f39075 = c17492;
        c17492.setAdapter(this.f39062);
        this.f39075.setLayoutManager(new C13115(this));
        this.f39075.getItemAnimator().m5954(200L);
        this.f39075.getItemAnimator().m5952(200L);
        this.f39075.getItemAnimator().m5961(200L);
        this.f39075.getItemAnimator().m5964(200L);
        this.f39067.setOnClickListener(new View.OnClickListener() { // from class: l.᩹ۡۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC11632 activityC11632 = this.f72532;
                activityC11632.f39075.smoothScrollToPosition(activityC11632.f39064);
            }
        });
        this.f39075.addOnScrollListener(new C16530(this));
        C17492 c17493 = this.f39075;
        C11546 c11546 = this.f39077;
        C13638.requireNonNull(c11546);
        c17493.addOnItemTouchListener(new C9202(c17493, new C1006(c11546)));
        C4647 c4647 = new C4647(new C17235(this));
        this.f39073 = c4647;
        c4647.m12825(this.f39075);
        this.f39077.m28841(this.f39062);
        this.f39077.m28842(this.f39073);
        m28998();
        if ((bundle == null ? m28989(getIntent(), false, true) : false) || this.f39064 != -1 || (iM28996 = m28996()) == -1) {
            return;
        }
        m28999(iM28996, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28983(ActivityC11632 activityC11632) {
        int width = (activityC11632.f39061.getWidth() - activityC11632.f39061.getChildAt(1).getWidth()) - activityC11632.f39067.getWidth();
        int iM33769 = C13932.m33769(36.0f);
        float f = -(width > iM33769 * 2 ? width - iM33769 : width / 2);
        if (activityC11632.f39067.getTranslationX() != f) {
            activityC11632.f39067.setTranslationX(f);
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStop() {
        this.f39065 = false;
        super.onStop();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC10074, l.ActivityC1086, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m28976();
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    private void m28976() {
        if (getResources().getConfiguration().orientation == 2) {
            m31021().m16253(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m31021().m16256(1);
        }
    }

    @Override // l.ActivityC1086, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f39078) {
            return;
        }
        m28989(intent, false, false);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29021(Intent intent) {
        m28989(intent, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28989(Intent intent, boolean z, final boolean z2) {
        C20409 c20409;
        boolean z3;
        String stringExtra;
        if (intent.getBooleanExtra("fromExternalApp", false)) {
            this.f39065 = true;
        }
        if ("bin.mt.edit2.ACTION_CREATE_WITH_TEXT".equals(intent.getAction())) {
            m29025();
            return false;
        }
        if (!"android.intent.action.SEND".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.TEXT") || (stringExtra = intent.getStringExtra("android.intent.extra.TEXT")) == null) {
            boolean zEquals = "android.intent.action.VIEW".equals(intent.getAction());
            ArrayList arrayList = this.f39080;
            if (!zEquals && !"android.intent.action.EDIT".equals(intent.getAction())) {
                if (arrayList.isEmpty()) {
                    m29025();
                    return false;
                }
            } else if (intent.getData() == null) {
                if (arrayList.isEmpty()) {
                    m29025();
                    return false;
                }
            } else if (z || C6696.m18082()) {
                try {
                    AbstractC20745 abstractC20745M15309 = C5553.m15309(intent);
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            i = -1;
                            c20409 = null;
                            break;
                        }
                        c20409 = (C20409) arrayList.get(i);
                        if (c20409.m13346().f53983.mo33986().equals(abstractC20745M15309.mo33986())) {
                            break;
                        }
                        i++;
                    }
                    if (c20409 == null) {
                        if (arrayList.size() == 1) {
                            C20409 c204010 = (C20409) arrayList.get(0);
                            if (!c204010.m13356() || c204010.m13338()) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                        C20409 c204011 = new C20409();
                        c204011.m13349((String) null);
                        String strMo33986 = abstractC20745M15309.mo33986();
                        Bundle bundle = c204011.f16884;
                        bundle.putString("filePath", strMo33986);
                        if (EnumC21736.m48500() != EnumC21736.ALWAYS_KEEP) {
                            bundle.putBoolean("temp", true);
                        }
                        String stringExtra2 = intent.getStringExtra("save_as_path");
                        if (stringExtra2 != null) {
                            bundle.putString("save_as_path", stringExtra2);
                        }
                        if (intent.getBooleanExtra("axml", false)) {
                            bundle.putBoolean("forceTryAXml", true);
                        }
                        if (intent.getBooleanExtra(Name.LABEL, false)) {
                            bundle.putBoolean("forceTryClass", true);
                        }
                        int iM28981 = m28981(m28996() + 1, false);
                        arrayList.add(iM28981, c204011);
                        m29009();
                        c204011.mo13341(new String[0]);
                        i = iM28981;
                    } else {
                        z3 = false;
                    }
                    m28999(i, false);
                    if (z3) {
                        m29016((C20409) arrayList.get(0));
                    }
                } catch (Exception e) {
                    m31003((Throwable) e, true);
                    return false;
                }
            } else {
                final Intent intent2 = new Intent(intent);
                this.f39078 = true;
                C17485 c17485 = new C17485(this, R.string.MT_Protector);
                c17485.m40701(500);
                this.f39069 = c17485;
                C4716.f16636.execute(new Runnable() { // from class: l.۟ۡۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = ActivityC11632.f39058;
                        try {
                            C6696.m18105();
                        } catch (Throwable unused) {
                        }
                        C16737.m39273(new RunnableC5240(this.f24430, intent2, z2));
                    }
                });
                return true;
            }
            return false;
        }
        C5446.f18781 = stringExtra;
        m29025();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28986(ActivityC11632 activityC11632, Intent intent, boolean z) {
        int iM28996;
        C17485 c17485 = activityC11632.f39069;
        if (c17485 != null) {
            c17485.m40694();
            activityC11632.f39069 = null;
        }
        activityC11632.f39078 = false;
        AbstractC8894 abstractC8894M43943 = activityC11632.m43943();
        if (activityC11632.isFinishing() || activityC11632.isDestroyed() || abstractC8894M43943.m23132() || abstractC8894M43943.m23115()) {
            return;
        }
        activityC11632.m28989(intent, true, false);
        if (z && activityC11632.f39064 == -1 && (iM28996 = activityC11632.m28996()) != -1) {
            activityC11632.m28999(iM28996, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28982(CharSequence charSequence) {
        C5446.f18781 = charSequence;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29019(int i) {
        C7606 c7606 = this.f39074;
        if (c7606 != null) {
            c7606.m20142(this, R.layout.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final View m29013(int i) {
        C7606 c7606 = this.f39074;
        if (c7606 != null) {
            return c7606.m20141(R.layout.MT_Protector);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m29014() {
        if (ApplicationC0716.f2988.getBoolean("double_confirm_before_exit", false)) {
            return this.f39063.m50802();
        }
        return false;
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10632() {
        this.f39065 = false;
        m29017(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29017(boolean z) {
        if (z && m29014()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        System.out.println("exitToExternalApp=" + this.f39065);
        m28991();
        finish();
        if (this.f39065) {
            moveTaskToBack(true);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29024(boolean z) {
        if (this.f39068) {
            return;
        }
        boolean z2 = true;
        this.f39068 = true;
        ArrayList<C20409> arrayList = this.f39080;
        if (z) {
            C20409 c20409 = (C20409) arrayList.get(this.f39064);
            ArrayList arrayList2 = new ArrayList();
            for (C20409 c204010 : arrayList) {
                if (c204010.mo13352() && c204010 != c20409 && !c204010.m13338()) {
                    arrayList2.add(c204010);
                }
            }
            boolean zIsEmpty = arrayList2.isEmpty();
            boolean z3 = !zIsEmpty;
            if (!zIsEmpty) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C20409) it.next()).m46146();
                }
                arrayList.removeAll(arrayList2);
                this.f39064 = arrayList.indexOf(c20409);
            }
            if (c20409.mo13352()) {
                arrayList.remove(this.f39064);
                int i = this.f39064;
                if (i > 0) {
                    this.f39064 = i - 1;
                }
                c20409.m46146();
            } else {
                z2 = z3;
            }
            if (z2) {
                m28978();
                m29009();
            }
        } else {
            C20409 c204011 = (C20409) arrayList.get(this.f39064);
            if (c204011.mo13352()) {
                arrayList.remove(this.f39064);
                int i2 = this.f39064;
                if (i2 > 0) {
                    this.f39064 = i2 - 1;
                }
                c204011.m46146();
                m28978();
                m29009();
            }
        }
        m29017(false);
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m28991();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onPause() {
        super.onPause();
        m28991();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29015(MenuItem menuItem) {
        if (C9886.f33734.m50803()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f39077.m28844(true);
            return;
        }
        if (this.f39077.m28846()) {
            return;
        }
        ArrayList arrayList = this.f39080;
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m29012();
                m29025();
                return;
            } else {
                if (itemId == R.id.MT_Protector) {
                    ((C20409) arrayList.get(this.f39064)).onOptionsItemSelected(menuItem);
                    return;
                }
                return;
            }
        }
        LinkedList linkedList = new LinkedList();
        for (C20409 c20409 : new ArrayList(arrayList)) {
            if (c20409.m13338() && !c20409.m13356()) {
                linkedList.add(new C21114(c20409, this));
            }
        }
        if (linkedList.isEmpty()) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            new C0301(this, linkedList).m10243();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private String m28979(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f39080;
        if (i >= arrayList.size()) {
            return null;
        }
        return C13012.m32189(50, ((C20409) arrayList.get(i)).m13346().f53983.getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28988(ActivityC11632 activityC11632, C12418 c12418, int i) {
        ArrayList arrayList = activityC11632.f39080;
        C3123 c3123 = new C3123();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C20409 c20409 = (C20409) arrayList.get(i2);
            if (!c20409.m13358()) {
                c3123.f11784++;
                if (!c20409.m13338()) {
                    c3123.f11781++;
                }
                if (i2 < i) {
                    c3123.f11782++;
                } else if (i2 > i) {
                    c3123.f11783++;
                }
            }
        }
        if (C3123.m9424(c3123)) {
            SubMenu subMenuAddSubMenu = c12418.addSubMenu(0, R.id.MT_Protector, 0, activityC11632.getString(R.string.MT_Protector) + "…");
            subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
            subMenuAddSubMenu.setHeaderTitle(R.string.MT_Protector);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3123.f11782 + c3123.f11783 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3123.f11784 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3123.f11781 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3123.f11782 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c3123.f11783 > 0);
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m29020() {
        return this.f39079;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m29022(final int i) {
        String strM28979 = m28979(i);
        if (strM28979 == null) {
            return;
        }
        View viewM30995 = m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM28979));
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.۬ۡۖ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC11632.m28995(this.f43362, i, checkBox);
            }
        };
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, onClickListener);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28987(ActivityC11632 activityC11632, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC11632.f39080);
        C23520.m51799(arrayList, new C21468());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C9475(activityC11632, linkedList, (C20409) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC11632.f39079 = true;
        ((C9475) linkedList.removeFirst()).m24288();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29000(ActivityC11632 activityC11632) {
        activityC11632.f39079 = true;
        try {
            for (C20409 c20409 : new ArrayList(activityC11632.f39080)) {
                if (!c20409.m13338() && !c20409.m13358()) {
                    activityC11632.m29016(c20409);
                }
            }
            activityC11632.f39079 = false;
        } catch (Throwable th) {
            activityC11632.f39079 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m29026(int i) {
        String strM28979 = m28979(i);
        if (strM28979 == null) {
            return;
        }
        View viewM30995 = m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM28979));
        DialogInterfaceOnClickListenerC15119 dialogInterfaceOnClickListenerC15119 = new DialogInterfaceOnClickListenerC15119(this, i, (CheckBox) viewM30995.findViewById(R.id.MT_Protector), 0);
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, dialogInterfaceOnClickListenerC15119);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m29011(final int i) {
        String strM28979 = m28979(i);
        if (strM28979 == null) {
            return;
        }
        View viewM30995 = m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM28979));
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۜۡۖ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC11632.m28985(this.f22466, i, checkBox);
            }
        };
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, onClickListener);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m29018() {
        C10886 c10886 = this.f39062;
        if (c10886 != null) {
            c10886.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29012() {
        if (this.f39061.m40473(8388611)) {
            this.f39061.m40477(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public void m28998() {
        boolean zM40473 = this.f39061.m40473(8388611);
        C13115 c13115 = (C13115) this.f39075.getLayoutManager();
        C13638.requireNonNull(c13115);
        int iFindFirstVisibleItemPosition = c13115.findFirstVisibleItemPosition();
        int childCount = c13115.getChildCount() + iFindFirstVisibleItemPosition;
        int i = this.f39064;
        if (i < iFindFirstVisibleItemPosition || i >= childCount) {
            if (this.f39066) {
                return;
            }
            this.f39066 = true;
            if (zM40473) {
                this.f39067.setVisibility(0);
                this.f39067.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f39067, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f39066) {
            this.f39066 = false;
            if (zM40473) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f39067, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat.addListener(new C5946(this));
                objectAnimatorOfFloat.setDuration(200L).start();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m29025() {
        C20409 c20409 = new C20409();
        c20409.m13349((String) null);
        c20409.f16884.putString("filePath", "untitled");
        ArrayList arrayList = this.f39080;
        if (arrayList.isEmpty()) {
            this.f39064 = -1;
        }
        int iM28981 = m28981(this.f39064 + 1, false);
        arrayList.add(iM28981, c20409);
        m29009();
        c20409.mo13341(new String[0]);
        m28999(iM28981, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29016(C20409 c20409) {
        int i;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new RuntimeException();
        }
        ArrayList arrayList = this.f39080;
        int iIndexOf = arrayList.indexOf(c20409);
        C6171.m17176(iIndexOf != -1);
        if (arrayList.size() > 1 && iIndexOf == (i = this.f39064)) {
            if (i > 0) {
                m28999(i - 1, true);
            } else {
                m28999(i + 1, true);
            }
            C6171.m17176(iIndexOf != this.f39064);
        }
        ComponentCallbacksC22654 componentCallbacksC22654M23119 = m43943().m23119(c20409.m13348());
        if (componentCallbacksC22654M23119 != null) {
            C6171.m17176(c20409 == componentCallbacksC22654M23119);
            AbstractC11447 abstractC11447M23118 = m43943().m23118();
            abstractC11447M23118.mo8559(c20409);
            abstractC11447M23118.mo8560();
        } else {
            C6171.m17176((c20409.isAdded() || c20409.isDetached()) ? false : true);
        }
        arrayList.remove(iIndexOf);
        int i2 = this.f39064;
        if (iIndexOf < i2) {
            this.f39064 = i2 - 1;
            m28978();
            m28998();
        }
        this.f39062.notifyItemRemoved(iIndexOf);
        c20409.m46146();
        m29009();
        if (arrayList.isEmpty()) {
            m29017(false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29023(C20409 c20409) {
        int iIndexOf = this.f39080.indexOf(c20409);
        if (iIndexOf != -1) {
            m28999(iIndexOf, false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29001(ActivityC11632 activityC11632, int i) {
        activityC11632.m28999(i, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m28999(int i, boolean z) {
        InterfaceC19083 interfaceC19083M46152;
        if (i >= 0) {
            ArrayList arrayList = this.f39080;
            if (i < arrayList.size()) {
                AbstractC8894 abstractC8894M43943 = m43943();
                if (abstractC8894M43943.m23132() || abstractC8894M43943.m23115()) {
                    return;
                }
                int i2 = this.f39064;
                if (i2 == -1) {
                    C20409 c20409 = (C20409) arrayList.get(i);
                    AbstractC11447 abstractC11447M23118 = abstractC8894M43943.m23118();
                    abstractC11447M23118.m28562(R.id.MT_Protector, c20409, c20409.m13348());
                    abstractC11447M23118.mo8560();
                    this.f39064 = i;
                    m28978();
                    m28998();
                    this.f39062.notifyDataSetChanged();
                    return;
                }
                if (i2 != i) {
                    C20409 c204010 = (C20409) arrayList.get(i2);
                    C20409 c204011 = (C20409) arrayList.get(i);
                    if (!z && (interfaceC19083M46152 = c204010.m46152()) != null) {
                        if (this.f39072.m17519()) {
                            this.f39072.m17520((Runnable) new RunnableC10180(0, interfaceC19083M46152));
                        } else {
                            interfaceC19083M46152.mo30475();
                            this.f39072.m17520((Runnable) new RunnableC17940(interfaceC19083M46152));
                        }
                    }
                    AbstractC11447 abstractC11447M23119 = abstractC8894M43943.m23118();
                    if (this.f39064 < i) {
                        abstractC11447M23119.m28561(R.anim.MT_Protector, R.anim.MT_Protector);
                    } else {
                        abstractC11447M23119.m28561(R.anim.MT_Protector, R.anim.MT_Protector);
                    }
                    abstractC11447M23119.mo8562(c204010);
                    if (c204011.isDetached()) {
                        abstractC11447M23119.m28565(c204011);
                    } else {
                        abstractC11447M23119.m28566(c204011, c204011.m13348());
                    }
                    abstractC11447M23119.mo8558();
                    this.f39064 = i;
                    m28978();
                    m28998();
                    this.f39062.notifyDataSetChanged();
                    return;
                }
                ((C20409) arrayList.get(i2)).m46129();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m28981(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f39080;
            if (i >= arrayList.size()) {
                break;
            }
            C20409 c20409 = (C20409) arrayList.get(i);
            if (z || !c20409.m13358()) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public void m29009() {
        AbstractC20745 abstractC20745M7344 = C2417.m7344();
        C11018 c11018M43576 = C18917.m43576(1736577895);
        for (C20409 c20409 : this.f39080) {
            c20409.getClass();
            Parcel parcelObtain = Parcel.obtain();
            c20409.requireArguments().writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            c11018M43576.m27794(bArrMarshall);
        }
        try {
            new RunnableC7563(abstractC20745M7344, c11018M43576, f39060).m20083();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m28991() {
        InterfaceC19083 interfaceC19083M46152;
        int i = this.f39064;
        if (i != -1) {
            ArrayList arrayList = this.f39080;
            if (i >= arrayList.size() || (interfaceC19083M46152 = ((C20409) arrayList.get(this.f39064)).m46152()) == null) {
                return;
            }
            interfaceC19083M46152.mo30475();
            this.f39072.m17520((Runnable) new RunnableC17940(interfaceC19083M46152));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public void m28978() {
        C11018 c11018 = new C11018(4);
        c11018.writeInt(this.f39064);
        AbstractC20745 abstractC20745M7346 = C2417.m7346();
        Object obj = f39059;
        C4716.m13051(new RunnableC7563(abstractC20745M7346, c11018, obj), obj, 200L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.᩷۠ۚ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x001b -> B:16:0x0020). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m28996() throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = -1
            l.᩷۠ۚ r1 = l.C2417.m7346()     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = l.ActivityC11632.f39059     // Catch: java.lang.Exception -> L24
            monitor-enter(r2)     // Catch: java.lang.Exception -> L24
            boolean r3 = r1.mo33975()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L17
            l.ܿ۬ۨ r1 = r1.m46713()     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.readInt()     // Catch: java.lang.Throwable -> L1c
            goto L18
        L17:
            r1 = -1
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            goto L2c
        L1a:
            r3 = move-exception
            goto L20
        L1c:
            r1 = move-exception
            r3 = -1
            r3 = r1
            r1 = -1
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Exception -> L22
        L22:
            r2 = move-exception
            goto L27
        L24:
            r1 = move-exception
            r2 = r1
            r1 = -1
        L27:
            l.֡᩷ۖ r3 = r4.f39076
            r3.m2969(r2)
        L2c:
            java.util.ArrayList r2 = r4.f39080
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L35
            goto L43
        L35:
            if (r1 < 0) goto L42
            java.util.ArrayList r0 = r4.f39080
            int r0 = r0.size()
            if (r1 < r0) goto L40
            goto L42
        L40:
            r0 = r1
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC11632.m28996():int");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m28994(ActivityC11632 activityC11632, int i) {
        int iM28981;
        ArrayList arrayList = activityC11632.f39080;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        C20409 c20409 = (C20409) arrayList.get(i);
        if (c20409.m13358()) {
            iM28981 = activityC11632.m28981(0, false);
            Bundle bundleRequireArguments = c20409.requireArguments();
            C13638.requireNonNull(bundleRequireArguments);
            bundleRequireArguments.putBoolean("top", false);
            while (iM28981 < arrayList.size() && ((C20409) arrayList.get(iM28981)).m13358()) {
                iM28981++;
            }
        } else {
            int iM28982 = activityC11632.m28981(0, true);
            Bundle bundleRequireArguments2 = c20409.requireArguments();
            C13638.requireNonNull(bundleRequireArguments2);
            bundleRequireArguments2.putBoolean("top", true);
            c20409.m46150();
            iM28981 = iM28982;
        }
        if (i != iM28981) {
            C20409 c204010 = (C20409) arrayList.get(activityC11632.f39064);
            if (i < iM28981) {
                iM28981--;
            }
            arrayList.remove(i);
            arrayList.add(iM28981, c20409);
            activityC11632.f39064 = arrayList.indexOf(c204010);
            activityC11632.m28978();
            activityC11632.m28998();
        }
        activityC11632.m29009();
        activityC11632.f39062.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29003() {
        return ApplicationC0716.f2992.getBoolean("axml_id_2_name", true);
    }
}
