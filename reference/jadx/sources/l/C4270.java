package l;

import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۘܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 29SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4270 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public TextView f15515;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3524 f15516;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f15517;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f15518;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final LinkedList f15519 = new LinkedList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC24408 f15520;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19987 f15521;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Drawable f15522;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f15523;

    public C4270(AbstractActivityC17204 abstractActivityC17204, final ArrayList arrayList) {
        this.f15523 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f15523.add(new C6508(this, (C11441) arrayList.get(i), i));
        }
        abstractActivityC17204.getClass();
        Drawable drawableMutate = C7508.m20563(abstractActivityC17204, R.drawable.MT_Protector).mutate();
        this.f15522 = drawableMutate;
        drawableMutate.setColorFilter(C2930.m9575(C3296.f10741));
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        C7308 c7308 = (C7308) viewM40395.findViewById(R.id.searchView);
        this.f15515 = (TextView) viewM40395.findViewById(R.id.title);
        C19987 c19987 = (C19987) viewM40395.findViewById(R.id.MT_Protector);
        this.f15521 = c19987;
        C3524 c3524 = new C3524(this);
        this.f15516 = c3524;
        c19987.setAdapter((ListAdapter) c3524);
        c19987.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ܽܺ۫
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                C4270.m13598(this.f58155, i2);
            }
        });
        c19987.setFastScrollEnabled(true);
        C18597.m43179(c19987);
        c7308.m20007(new C23662(this));
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶܺ۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C4270.m13600(this.f52591, arrayList);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f15518 = c2361BuildDialog.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13598(C4270 c4270, int i) {
        C3524 c3524 = c4270.f15516;
        int i2 = ((C6508) c3524.f12109.get(i)).f21852;
        if (c4270.f15517 != i2) {
            c4270.f15517 = i2;
            c3524.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13600(C4270 c4270, List list) {
        InterfaceC24408 interfaceC24408 = c4270.f15520;
        if (interfaceC24408 != null) {
            int i = c4270.f15517;
            interfaceC24408.mo11073(i, (C11441) list.get(i));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13611(int i) {
        this.f15515.setText(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13610(InterfaceC24408 interfaceC24408) {
        this.f15520 = interfaceC24408;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13609(int i) {
        this.f15517 = i;
        this.f15521.setSelection(i);
        this.f15516.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13608() {
        this.f15518.m22432();
        LinkedList linkedList = new LinkedList();
        for (C6508 c6508 : this.f15523) {
            if (c6508.f21848) {
                linkedList.add(c6508);
            }
        }
        ExecutorService executorService = C5261.f18540;
        int i = 2;
        executorService.execute(new RunnableC20701(i, this));
        executorService.execute(new RunnableC1014(i, this, linkedList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13597(C4270 c4270) {
        Iterator it = c4270.f15523.iterator();
        while (it.hasNext()) {
            ((C6508) it.next()).f21849.m28799();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13599(C4270 c4270, LinkedList linkedList) {
        final C6508 c6508;
        while (c4270.f15518.m22434()) {
            while (!c4270.f15519.isEmpty()) {
                int iMax = Math.max(1, (c4270.f15521.getLastVisiblePosition() - c4270.f15521.getFirstVisiblePosition()) + 1);
                synchronized (c4270.f15519) {
                    while (c4270.f15519.size() > iMax) {
                        c4270.f15519.removeFirst();
                    }
                    c6508 = (C6508) c4270.f15519.removeLast();
                }
                if (c6508.f21848) {
                    c6508.f21848 = false;
                    final BitmapDrawable bitmapDrawableM48870 = RunnableC21479.m48870(c6508.f21849.f35956);
                    C21576.m49068(new Runnable() { // from class: l.ۨܺ۫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6508 c6509 = c6508;
                            C6389 c6389 = c6509.f21851;
                            boolean z = c6509.f21847;
                            BitmapDrawable bitmapDrawable = bitmapDrawableM48870;
                            if (!z) {
                                c6389.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c6389.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c6389.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
                while (c4270.f15518.m22434() && c4270.f15521.m45949()) {
                    SystemClock.sleep(100L);
                }
                if (!c4270.f15518.m22434()) {
                    return;
                }
            }
            while (!linkedList.isEmpty()) {
                if (c4270.f15519.isEmpty()) {
                    final C6508 c6509 = (C6508) linkedList.removeFirst();
                    if (c6509.f21848) {
                        c6509.f21848 = false;
                        final BitmapDrawable bitmapDrawableM48871 = RunnableC21479.m48870(c6509.f21849.f35956);
                        C21576.m49068(new Runnable() { // from class: l.ۨܺ۫
                            @Override // java.lang.Runnable
                            public final void run() {
                                C6508 c65010 = c6509;
                                C6389 c6389 = c65010.f21851;
                                boolean z = c65010.f21847;
                                BitmapDrawable bitmapDrawable = bitmapDrawableM48871;
                                if (!z) {
                                    c6389.setDrawable(bitmapDrawable);
                                    return;
                                }
                                Drawable drawable = c6389.getDrawable();
                                bitmapDrawable.setBounds(drawable.getBounds());
                                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                                c6389.setDrawable(transitionDrawable);
                                transitionDrawable.setCrossFadeEnabled(true);
                                transitionDrawable.startTransition(300);
                            }
                        });
                    }
                    while (c4270.f15518.m22434() && c4270.f15521.m45949()) {
                        SystemClock.sleep(100L);
                    }
                    if (!c4270.f15518.m22434()) {
                        return;
                    }
                }
            }
            return;
        }
    }
}
