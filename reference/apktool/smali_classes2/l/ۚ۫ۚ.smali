.class public final Ll/ۚ۫ۚ;
.super Ljava/lang/Object;
.source "66FP"


# instance fields
.field public ۙ:Z

.field public ۤ:Ljava/lang/String;

.field public ᩴ:Z

.field public final ᩷:Lbin/mt/json/JSONArray;

.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Ll/ۚ۫ۚ;->᩷:Lbin/mt/json/JSONArray;

    const-string v0, ""

    .line 218
    iput-object v0, p0, Ll/ۚ۫ۚ;->ۤ:Ljava/lang/String;

    return-void
.end method
