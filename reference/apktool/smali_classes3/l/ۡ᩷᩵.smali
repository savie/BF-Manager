.class public final Ll/ۡ᩷᩵;
.super Ljava/lang/Object;
.source "LISH"


# instance fields
.field public final ۙ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ljava/util/HashSet;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ۡ᩷᩵;->ۙ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/᩷ۡۗ;)Z
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ۡ᩷᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
