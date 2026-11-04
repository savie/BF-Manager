.class public final Ll/᩺ۛ᩸;
.super Ljava/lang/Object;
.source "75NJ"


# instance fields
.field public ۙ:Z

.field public ۤ:Ljava/util/LinkedList;

.field public ᩷:Ll/۟ܰ᩸;

.field public final synthetic ᩸:Ll/ܿۛ᩸;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ܿۛ᩸;Ljava/util/LinkedList;Ll/۟ܰ᩸;Z)V
    .locals 0

    .line 893
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۛ᩸;->᩸:Ll/ܿۛ᩸;

    .line 894
    iput-object p2, p0, Ll/᩺ۛ᩸;->ۤ:Ljava/util/LinkedList;

    .line 895
    iput-object p3, p0, Ll/᩺ۛ᩸;->᩷:Ll/۟ܰ᩸;

    .line 896
    iput-boolean p4, p0, Ll/᩺ۛ᩸;->ۙ:Z

    return-void
.end method

.method public static synthetic ۙ(Ll/᩺ۛ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩺ۛ᩸;->᩷()V

    return-void
.end method

.method private ᩷()V
    .locals 3

    .line 918
    iget-object v0, p0, Ll/᩺ۛ᩸;->᩸:Ll/ܿۛ᩸;

    :try_start_0
    iget-object v1, p0, Ll/᩺ۛ᩸;->᩷:Ll/۟ܰ᩸;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3264
    invoke-virtual {v0, v1}, Ll/ܿۛ᩸;->ۙ(Ll/۟ܰ᩸;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 920
    invoke-static {v0}, Ll/ܿۛ᩸;->᩻(Ll/ܿۛ᩸;)Ll/֨ܰ᩸;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    .line 922
    :goto_0
    iget-object v1, p0, Ll/᩺ۛ᩸;->ۤ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 923
    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۛ᩸;

    invoke-virtual {v0}, Ll/᩺ۛ᩸;->ۙ()V

    goto :goto_1

    .line 925
    :cond_0
    invoke-static {v0}, Ll/ܿۛ᩸;->ܺ(Ll/ܿۛ᩸;)V

    :goto_1
    return-void
.end method

.method public static synthetic ᩷(Ll/᩺ۛ᩸;)V
    .locals 0

    .line 910
    invoke-direct {p0}, Ll/᩺ۛ᩸;->᩷()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 3

    .line 900
    iget-boolean v0, p0, Ll/᩺ۛ᩸;->ۙ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩺ۛ᩸;->᩷:Ll/۟ܰ᩸;

    invoke-virtual {v0}, Ll/ۜܽ᩸;->ۚ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 903
    :cond_0
    iget-object v1, p0, Ll/᩺ۛ᩸;->᩸:Ll/ܿۛ᩸;

    invoke-virtual {v1}, Ll/ܿۛ᩸;->ۤۙ()V

    .line 904
    invoke-virtual {v1, v0}, Ll/ܿۛ᩸;->᩷(Ll/۟ܰ᩸;)V

    .line 905
    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    .line 906
    invoke-virtual {v0}, Ll/ۜܽ᩸;->ۤ()Ll/ۡܰ᩸;

    move-result-object v0

    .line 58
    iget-object v0, v0, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 906
    invoke-virtual {v1, v0}, Ll/ۖۖۧ;->᩷(Ljava/lang/CharSequence;)V

    const v0, 0x7f120a8c

    .line 907
    invoke-virtual {v1, v0}, Ll/ۖۖۧ;->ۙ(I)V

    new-instance v0, Ll/᩵ۛ᩸;

    invoke-direct {v0, p0}, Ll/᩵ۛ᩸;-><init>(Ll/᩺ۛ᩸;)V

    const v2, 0x7f120a83

    .line 908
    invoke-virtual {v1, v2, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/ۨۛ᩸;

    invoke-direct {v0, p0}, Ll/ۨۛ᩸;-><init>(Ll/᩺ۛ᩸;)V

    const v2, 0x7f1202c6

    .line 910
    invoke-virtual {v1, v2, v0}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    const/4 v2, 0x0

    .line 911
    invoke-virtual {v1, v0, v2}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 912
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 901
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/᩺ۛ᩸;->᩷()V

    return-void
.end method
