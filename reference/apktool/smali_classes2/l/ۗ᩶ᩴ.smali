.class public final Ll/ۗ᩶ᩴ;
.super Ljava/lang/Object;
.source "89SC"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩷:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V
    .locals 0

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    iput-object p1, p0, Ll/ۗ᩶ᩴ;->ۙ:Ljava/lang/String;

    .line 144
    iput-object p2, p0, Ll/ۗ᩶ᩴ;->᩷:Ljava/util/concurrent/Callable;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۗ᩶ᩴ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗ᩶ᩴ;->ۙ:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ۗ᩶ᩴ;Ll/ܶ֡֫;)V
    .locals 0

    .line 154
    :try_start_0
    iget-object p0, p0, Ll/ۗ᩶ᩴ;->᩷:Ljava/util/concurrent/Callable;

    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 156
    invoke-interface {p1, p0}, Ll/ܶ֡֫;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۗ᩶ᩴ;)Ljava/util/concurrent/Callable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗ᩶ᩴ;->᩷:Ljava/util/concurrent/Callable;

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ll/ܽ֡֫;)Ll/۠ۖۧ;
    .locals 3

    .line 149
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    const v1, 0x7f1204c0

    .line 150
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(I)V

    iget-object v1, p0, Ll/ۗ᩶ᩴ;->ۙ:Ljava/lang/String;

    .line 151
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/۫᩺ܳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, p1}, Ll/۫᩺ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x7f120544

    .line 152
    invoke-virtual {v0, p1, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120161

    const/4 v1, 0x0

    .line 159
    invoke-virtual {v0, p1, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 160
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    return-object p1
.end method
