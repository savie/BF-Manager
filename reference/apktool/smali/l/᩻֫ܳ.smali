.class public final Ll/᩻֫ܳ;
.super Ljava/lang/Object;
.source "R6JU"


# instance fields
.field public ֡:Z

.field public final ֨:Ljava/lang/String;

.field public ֫:Z

.field public ۗ:Ll/۫֨ᩴ;

.field public ۘ:Z

.field public volatile ۙ:Z

.field public ۚ:Z

.field public final ۛ:Ljava/util/concurrent/atomic/AtomicLong;

.field public final synthetic ۟:Ll/ܽ֫ܳ;

.field public final ۢ:Ljava/lang/String;

.field public volatile ۤ:J

.field public volatile ۧ:Ll/֫ۚܳ;

.field public final ۨ:Ll/ۧ֫ܳ;

.field public ۫:Ll/ۚۚܳ;

.field public ܰ:I

.field public ܳ:Ll/᩹ۖ᩸;

.field public final ܶ:Ljava/lang/String;

.field public ܺ:Ljava/lang/String;

.field public ܽ:Z

.field public final ܿ:Ll/۫ۛᩴ;

.field public final ᩳ:Ll/֫֫ܳ;

.field public ᩴ:Ljava/lang/String;

.field public final ᩵:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public volatile ᩶:J

.field public ᩷:Z

.field public ᩸:Ll/۠ۖۧ;

.field public volatile ᩹:Ljava/io/InputStream;

.field public ᩺:Ll/᩷ۢܺ;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܽ֫ܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 619
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻֫ܳ;->۟:Ll/ܽ֫ܳ;

    .line 606
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/᩻֫ܳ;->᩵:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 610
    new-instance v0, Ll/۫ۛᩴ;

    invoke-direct {v0}, Ll/۫ۛᩴ;-><init>()V

    iput-object v0, p0, Ll/᩻֫ܳ;->ܿ:Ll/۫ۛᩴ;

    .line 616
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/᩻֫ܳ;->ۛ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 620
    new-instance v0, Ll/֫֫ܳ;

    invoke-direct {v0, p0}, Ll/֫֫ܳ;-><init>(Ll/᩻֫ܳ;)V

    iput-object v0, p0, Ll/᩻֫ܳ;->ᩳ:Ll/֫֫ܳ;

    .line 621
    new-instance v0, Ll/ۧ֫ܳ;

    invoke-direct {v0, p0}, Ll/ۧ֫ܳ;-><init>(Ll/᩻֫ܳ;)V

    iput-object v0, p0, Ll/᩻֫ܳ;->ۨ:Ll/ۧ֫ܳ;

    .line 625
    iput-object p2, p0, Ll/᩻֫ܳ;->ۢ:Ljava/lang/String;

    .line 626
    iput-object p3, p0, Ll/᩻֫ܳ;->ܺ:Ljava/lang/String;

    .line 627
    iput-object p4, p0, Ll/᩻֫ܳ;->֨:Ljava/lang/String;

    .line 628
    iput-wide p5, p0, Ll/᩻֫ܳ;->᩶:J

    .line 629
    invoke-static {p1}, Ll/ܽ֫ܳ;->ۤ(Ll/ܽ֫ܳ;)Landroid/webkit/WebView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֫ܳ;->ܶ:Ljava/lang/String;

    return-void
.end method
